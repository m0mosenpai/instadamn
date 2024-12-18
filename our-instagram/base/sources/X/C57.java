package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class C57 extends AbstractC25399BLq {
    public InterfaceC41501vz A00;
    public ReboundViewPager A01;
    public final Context A02;
    public final C2XI A03;
    public final C2XI A04;
    public final C2XI A05;
    public final C120985dq A06;
    public final UserSession A07;
    public final InterfaceC09390do A08;
    public final int A09;
    public final BOX A0A;
    public final C28179CbR A0B;
    public final C27922CSh A0C;
    public final String A0D;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57(android.content.Context r9, X.C120985dq r10, X.BOX r11, com.instagram.common.session.UserSession r12, X.C27922CSh r13, int r14) {
        /*
            r8 = this;
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            r8.<init>()
            r8.A02 = r9
            r8.A07 = r12
            r8.A09 = r14
            r8.A06 = r10
            r8.A0A = r11
            r8.A0C = r13
            r5 = 0
            X.2XI r6 = X.AbstractC25230BEn.A0c(r5)
            r8.A04 = r6
            X.0sl r0 = X.C16930sl.A00
            X.2XI r2 = new X.2XI
            r2.<init>(r0)
            r8.A03 = r2
            r1 = 0
            X.2XI r0 = new X.2XI
            r0.<init>(r1)
            r8.A05 = r0
            X.Ggz r0 = X.AbstractC37497GfF.A00(r12)
            java.lang.String r0 = r0.A00
            r8.A0D = r0
            X.CbR r0 = new X.CbR
            r0.<init>(r12)
            r8.A0B = r0
            X.0dv r1 = X.EnumC09460dv.A02
            r0 = 34
            X.DGs r0 = X.C29904DGs.A01(r8, r0)
            X.0do r0 = X.AbstractC09440dt.A00(r1, r0)
            r8.A08 = r0
            r1 = 3
            X.CtJ r0 = new X.CtJ
            r0.<init>(r8, r1)
            r8.A00 = r0
            X.1qM r0 = r10.A02
            java.util.List r7 = r8.A02(r0)
            if (r7 == 0) goto L5b
            r2.A00(r7)
        L5b:
            X.2XI r1 = r13.A00
            X.1qM r0 = r10.A02
            if (r0 == 0) goto Lce
            X.1rF r0 = r0.A0C
            X.DmF r0 = r0.AoZ()
            if (r0 == 0) goto Lce
            boolean r0 = r0.BV0()
        L6d:
            X.AbstractC25227BEk.A1F(r1, r0)
            X.2XI r1 = r13.A02
            X.1qM r0 = r10.A02
            if (r0 == 0) goto Lcc
            X.1rF r0 = r0.A0C
            X.DmF r0 = r0.AoZ()
            if (r0 == 0) goto Lcc
            java.lang.String r0 = r0.Bb8()
        L82:
            r1.A00(r0)
            X.2XI r0 = r13.A01
            X.AbstractC25227BEk.A1F(r0, r5)
            r3 = 0
            if (r7 == 0) goto Lbf
            X.5dq r0 = r8.A06
            X.1qM r0 = r0.A02
            if (r0 == 0) goto Lb9
            X.1rF r0 = r0.A0C
            java.lang.String r4 = r0.BsX()
            if (r4 == 0) goto Lb9
            java.util.Iterator r2 = r7.iterator()
        L9f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Bfg r0 = (X.C26053Bfg) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.AbstractC002300n.A0h(r0, r4, r5)
            if (r0 == 0) goto L9f
            r3 = r1
        Lb5:
            X.Bfg r3 = (X.C26053Bfg) r3
            if (r3 != 0) goto Lbf
        Lb9:
            java.lang.Object r3 = X.AbstractC001800i.A0J(r7)
            X.Bfg r3 = (X.C26053Bfg) r3
        Lbf:
            A00(r3, r8)
            if (r7 == 0) goto Lc8
            int r5 = r7.indexOf(r3)
        Lc8:
            X.AbstractC25227BEk.A1E(r6, r5)
            return
        Lcc:
            r0 = 0
            goto L82
        Lce:
            r0 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57.<init>(android.content.Context, X.5dq, X.BOX, com.instagram.common.session.UserSession, X.CSh, int):void");
    }

    public final List A02(C38321qM c38321qM) {
        InterfaceC31132DmF AoZ;
        List<C38321qM> Aoa;
        List AoY;
        User A14;
        String str;
        if (c38321qM == null || (AoZ = c38321qM.A0C.AoZ()) == null || (Aoa = AoZ.Aoa()) == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C38321qM c38321qM2 : Aoa) {
            User A142 = AbstractC25226BEj.A14(c38321qM2);
            if (A142 != null && (AoY = c38321qM2.A0C.AoY()) != null && (A14 = AbstractC25226BEj.A14(c38321qM2)) != null) {
                ImageUrl Bhu = A14.Bhu();
                User A143 = AbstractC25226BEj.A14(c38321qM2);
                if (A143 != null) {
                    String id = A143.getId();
                    String id2 = c38321qM2.getId();
                    if (id2 != null) {
                        List A1J = AbstractC166987dD.A1J(Bhu);
                        boolean A5l = c38321qM2.A5l();
                        int A0w = c38321qM2.A0w();
                        String A3C = c38321qM2.A3C(this.A02);
                        if (A3C != null) {
                            str = A3C.toString();
                        } else {
                            str = null;
                        }
                        A1E.add(new C26053Bfg(A142, id2, id, str, AoY, A1J, A0w, A5l));
                    }
                }
            }
        }
        return A1E;
    }

    public static final void A00(C26053Bfg c26053Bfg, C57 c57) {
        String str;
        String str2;
        User user;
        c57.A05.A00(c26053Bfg);
        BOX box = c57.A0A;
        String str3 = null;
        if (box != null) {
            C38321qM c38321qM = c57.A06.A02;
            if (c38321qM != null) {
                str = c38321qM.A38();
            } else {
                str = null;
            }
            box.A02 = str;
            if (c26053Bfg != null) {
                str2 = c26053Bfg.A06;
            } else {
                str2 = null;
            }
            box.A01 = str2;
            if (c26053Bfg != null && (user = (User) c26053Bfg.A04) != null) {
                str3 = user.getUsername();
            }
            box.A00 = str3;
        }
    }

    public static final void A01(C57 c57, int i) {
        String str;
        boolean A1N = AbstractC167007dF.A1N(i);
        C28179CbR c28179CbR = c57.A0B;
        C26053Bfg c26053Bfg = (C26053Bfg) c57.A05.A00;
        if (c26053Bfg != null) {
            str = c26053Bfg.A06;
        } else {
            str = null;
        }
        int i2 = c57.A09;
        String str2 = c57.A0D;
        C14360o3.A0B(str2, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28179CbR.A00, "instagram_clips_spin_impression");
        Long A00 = C28179CbR.A00(str);
        if (A0f.isSampled() && A00 != null) {
            int i3 = 43;
            if (A1N) {
                i3 = 16;
            }
            AbstractC25225BEi.A1O(A0f, "spins_impression_reels_viewer");
            A0f.A9K("media_id", A00);
            AbstractC25229BEm.A19(A0f, i2);
            AbstractC25225BEi.A1P(A0f, str2);
            AbstractC166997dE.A1N(A0f, AbstractC111324zv.A00(2700), i3);
            A0f.AAP("chaining_session_id", str2);
            A0f.A9K("h_scroll_position", Long.valueOf(i));
            AbstractC25232BEp.A1L(A0f, "nav_chain", AbstractC25225BEi.A14());
        }
    }
}
