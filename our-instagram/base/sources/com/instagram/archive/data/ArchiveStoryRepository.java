package com.instagram.archive.data;

import X.C08730cb;
import X.C16930sl;
import X.C17060sy;
import X.C1OU;
import X.C4A7;
import X.C4A8;
import X.MSZ;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* loaded from: classes9.dex */
public final class ArchiveStoryRepository extends C4A7 {
    public List A00;
    public Integer A01;
    public String A02;
    public final UserSession A03;
    public final ReelStore A04;
    public final C17060sy A05;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r9, X.InterfaceC23621Ds r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.ArchiveStoryRepository.A00(java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArchiveStoryRepository(UserSession userSession) {
        super("StoryArchive", C4A8.A00(953251634));
        ReelStore A04 = C1OU.A04(userSession);
        C17060sy A00 = C08730cb.A00(userSession);
        MSZ.A1O(userSession, A00);
        this.A03 = userSession;
        this.A04 = A04;
        this.A05 = A00;
        this.A00 = C16930sl.A00;
    }
}
