package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerModel;

/* renamed from: X.9m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218939m3 extends C8FA {
    public AbstractC130945vi A00;
    public ProfileStickerModel A01;
    public InterfaceC16820sZ A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final AbstractC018607g A07;
    public final InterfaceC11380iw A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C218939m3(android.content.Context r17, X.AbstractC018607g r18, X.InterfaceC11380iw r19, com.instagram.common.session.UserSession r20, X.C183688Ct r21, com.instagram.reels.smb.model.ProfileStickerModel r22) {
        /*
            r16 = this;
            r4 = 1
            r2 = 3
            r11 = 0
            r14 = 0
            r13 = 111(0x6f, float:1.56E-43)
            r9 = r16
            r10 = r21
            r12 = r11
            r15 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r7 = r17
            r9.A05 = r7
            r5 = r20
            r9.A06 = r5
            r8 = r18
            r9.A07 = r8
            r3 = r19
            r9.A08 = r3
            r6 = r22
            r9.A01 = r6
            r1 = 25
            X.B8Q r0 = new X.B8Q
            r0.<init>(r9, r1)
            r9.A02 = r0
            com.instagram.user.model.User r6 = r6.A03
            if (r6 == 0) goto L3d
            java.lang.Boolean r0 = r6.A0J()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            if (r0 == 0) goto L3e
            A01(r9)
        L3d:
            return
        L3e:
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r9.A01
            X.GzS[] r0 = r1.A00
            if (r0 == 0) goto L5b
            int r0 = r0.length
            if (r0 == 0) goto L5b
            boolean r0 = r1.A06
            if (r0 == 0) goto L55
            X.9p7 r0 = new X.9p7
            r0.<init>(r7, r1)
        L50:
            X.5vi r0 = (X.AbstractC130945vi) r0
            r9.A00 = r0
            return
        L55:
            X.9p8 r0 = new X.9p8
            r0.<init>(r7, r5, r1)
            goto L50
        L5b:
            r9.A04 = r4
            X.GzS[] r2 = new X.C38687GzS[r2]
            r1 = 5
            X.Acr r0 = new X.Acr
            r0.<init>(r1, r2, r9)
            X.Gee r4 = new X.Gee
            r4.<init>(r14, r3, r9, r0)
            X.2ry r3 = new X.2ry
            r3.<init>(r7, r8, r11)
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r5, r0)
            r2.A06()
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "ig_biz_id"
            r2.A9s(r0, r1)
            java.lang.String r0 = "business/account/get_ranked_media/"
            r2.A0B(r0)
            java.lang.Class<X.3Vk> r1 = X.C74293Vk.class
            java.lang.Class<X.3Vm> r0 = X.C74313Vm.class
            r2.A0P(r11, r1, r0, r14)
            X.1ON r0 = r2.A0N()
            r0.A00 = r4
            r3.schedule(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218939m3.<init>(android.content.Context, X.07g, X.0iw, com.instagram.common.session.UserSession, X.8Ct, com.instagram.reels.smb.model.ProfileStickerModel):void");
    }

    public static final void A01(C218939m3 c218939m3) {
        C5RN c5rn;
        c218939m3.A04 = false;
        ProfileStickerModel profileStickerModel = c218939m3.A01;
        int intValue = profileStickerModel.A04.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    c5rn = new C220869pA(c218939m3.A05, c218939m3.A06, profileStickerModel);
                } else {
                    throw B4Z.A00();
                }
            } else {
                C220849p8 c220849p8 = new C220849p8(c218939m3.A05, c218939m3.A06, profileStickerModel);
                c220849p8.A00 = true;
                c5rn = c220849p8;
            }
        } else {
            c5rn = new C220839p7(c218939m3.A05, profileStickerModel);
        }
        c218939m3.A00 = (AbstractC130945vi) c5rn;
        if (c218939m3.A03) {
            c218939m3.A04();
        }
    }
}
