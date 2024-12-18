package com.instagram.barcelona.feed.post.data;

import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class PostRepository extends C4A7 {
    public final UserSession A00;
    public final PostViewStateRepository A01;

    public PostRepository(PostViewStateRepository postViewStateRepository, UserSession userSession) {
        super("Barcelona_post", C4A8.A00(1682293663));
        this.A00 = userSession;
        this.A01 = postViewStateRepository;
    }
}
