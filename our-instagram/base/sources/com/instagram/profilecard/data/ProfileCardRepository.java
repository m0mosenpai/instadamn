package com.instagram.profilecard.data;

import X.AbstractC155486yb;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.AbstractC82073lT;
import X.AnonymousClass189;
import X.C05A;
import X.C18A;
import X.C26087BgG;
import X.C47955LGq;
import X.C4A7;
import X.C4A8;
import X.InterfaceC678133v;
import X.MWW;
import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ProfileCardRepository extends C4A7 {
    public InterfaceC678133v A00;
    public final C47955LGq A01;
    public final UserSession A02;
    public final MusicOnProfileProvider A03;
    public final C18A A04;
    public final String A05;
    public final String A06;
    public final C05A A07;
    public final Application A08;
    public final AbstractC59962oe A09;

    public ProfileCardRepository(Application application, AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        super("ProfileCard", C4A8.A00(248870630));
        String A00;
        this.A02 = userSession;
        this.A08 = application;
        this.A09 = abstractC59962oe;
        this.A06 = str;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A03 = AbstractC155486yb.A00(userSession);
        this.A01 = new C47955LGq(AbstractC166987dD.A0O(application), abstractC59962oe, userSession);
        if (AbstractC82073lT.A02(userSession)) {
            A00 = "https://www.instagram.com/%s/profilecard?r=nametag";
        } else {
            A00 = AbstractC43591JPw.A00(1041);
        }
        this.A05 = A00;
        this.A07 = AbstractC25225BEi.A1H(new C26087BgG((MWW) null, (InterfaceC678133v) null, (User) null, (String) null, (DefaultConstructorMarker) null, 15, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x017f, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.longValue()) > 600000) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a7, code lost:
    
        if (X.AbstractC167007dF.A1Z(r10) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a9, code lost:
    
        r3 = r5.A04.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b0, code lost:
    
        r3 = r5.A01.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a0, code lost:
    
        if (r5.A00 != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profilecard.data.ProfileCardRepository.A00(X.1Ds):java.lang.Object");
    }
}
