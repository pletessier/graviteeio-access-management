/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.am.management.repository.proxy;

import io.gravitee.am.repository.oauth2.api.AuthorizationCodeRepository;
import io.gravitee.am.repository.oauth2.model.AuthorizationCode;
import io.reactivex.Maybe;
import io.reactivex.Single;
import org.springframework.stereotype.Component;

/**
 * @author Titouan COMPIEGNE (titouan.compiegne at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class AuthorizationCodeRepositoryProxy extends AbstractProxy<AuthorizationCodeRepository> implements AuthorizationCodeRepository {

    @Override
    public Single<AuthorizationCode> create(AuthorizationCode authorizationCode) {
        return target.create(authorizationCode);
    }

    @Override
    public Maybe<AuthorizationCode> delete(String id) {
        return target.delete(id);
    }

    @Override
    public Maybe<AuthorizationCode> findByCode(String code) {
        return target.findByCode(code);
    }
}
