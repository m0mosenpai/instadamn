package com.instagram.barcelona.feed.post.data;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC31179DnN;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C4A7;
import X.C4A8;
import X.InterfaceC132315yA;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class PostViewStateRepository extends C4A7 {
    public final UserSession A00;
    public final C05A A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final LruCache A05;
    public final C0UO A06;
    public final C0UO A07;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.barcelona.feed.post.data.PostViewStateRepository r7, java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.post.data.PostViewStateRepository.A00(com.instagram.barcelona.feed.post.data.PostViewStateRepository, java.util.List, X.1Ds):java.lang.Object");
    }

    public static final void A01(PostViewStateRepository postViewStateRepository, InterfaceC132315yA interfaceC132315yA, String str) {
        Object value;
        C05A c05a = postViewStateRepository.A03;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, AbstractC06930Yk.A0C((Map) value, AbstractC166987dD.A1L(str, interfaceC132315yA))));
    }

    public PostViewStateRepository(UserSession userSession) {
        super("barcelona_post_translation", C4A8.A00(1476611206));
        this.A00 = userSession;
        this.A05 = new LruCache(500);
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A03 = A0h;
        this.A04 = A0h;
        C008002u A0h2 = AbstractC31179DnN.A0h();
        this.A01 = A0h2;
        this.A06 = A0h2;
        C008002u A0h3 = AbstractC31179DnN.A0h();
        this.A02 = A0h3;
        this.A07 = A0h3;
    }

    @Override // X.C4A7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.A05.evictAll();
    }
}
