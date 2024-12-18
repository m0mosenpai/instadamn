package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVL extends AbstractC51572Yf {
    public final InterfaceC11380iw A00;
    public final InterfaceC31025DkO A01;
    public final InterfaceC31168DnC A02;
    public final UserSession A03;
    public final InterfaceC31056Dkw A04;
    public final HashMap A05;
    public final HashMap A06;

    public BVL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31025DkO interfaceC31025DkO, InterfaceC31168DnC interfaceC31168DnC, InterfaceC31056Dkw interfaceC31056Dkw, HashMap hashMap, HashMap hashMap2) {
        C14360o3.A0B(interfaceC11380iw, 1);
        AbstractC25234BEr.A1R(userSession, interfaceC31168DnC, interfaceC31025DkO, interfaceC31056Dkw, hashMap);
        C14360o3.A0B(hashMap2, 7);
        this.A00 = interfaceC11380iw;
        this.A03 = userSession;
        this.A02 = interfaceC31168DnC;
        this.A01 = interfaceC31025DkO;
        this.A04 = interfaceC31056Dkw;
        this.A05 = hashMap;
        this.A06 = hashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r30) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVL.A0Y(X.3bS):X.2Vc");
    }

    private final AbstractC50812Vc A03(C2Z1 c2z1) {
        InterfaceC31168DnC interfaceC31168DnC = this.A02;
        MUG CH8 = interfaceC31168DnC.CH8();
        if (CH8 != null) {
            HashMap hashMap = this.A06;
            String id = interfaceC31168DnC.getId();
            InterfaceC11380iw interfaceC11380iw = this.A00;
            int A0A = AbstractC25228BEl.A0A(c2z1, AbstractC77623dm.A04(c2z1));
            ImageUrl imageUrl = (ImageUrl) AbstractC001800i.A0J((List) CH8.A00);
            C75933ay c75933ay = C51722Yv.A02;
            return new C26638BpZ(AbstractC25233BEq.A0d(AbstractC25233BEq.A0X(C9CU.A00(null, C05F.A00, 0, AbstractC77623dm.A0D(c2z1, R.dimen.clips_fullcard_auto_created_reel_video_width)), c2z1, R.dimen.clips_fullcard_auto_created_reel_video_height), DRY.A00(this, CH8, 39)), interfaceC11380iw, imageUrl, id, hashMap, 0, A0A);
        }
        return new BVP(this.A00, this.A03, this.A04, interfaceC31168DnC, this.A05);
    }

    public static String A05(C2Z0 c2z0, C5QE c5qe) {
        if (c5qe != null) {
            Context context = c2z0.ArD().A0C;
            C14360o3.A07(context);
            return BHX.A00(context, c5qe).toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.BVK A04(X.C51759Mti r11, X.C2Z1 r12, boolean r13) {
        /*
            r10 = this;
            X.2XE r0 = r12.ArD()
            android.content.Context r1 = r0.A0C
            r0 = 2130970337(0x7f0406e1, float:1.7549381E38)
            if (r13 == 0) goto Le
            r0 = 2130970338(0x7f0406e2, float:1.7549383E38)
        Le:
            int r7 = X.AbstractC53242c7.A0H(r1, r0)
            r6 = 2131239907(0x7f0823e3, float:1.8096134E38)
            if (r13 == 0) goto L1a
            r6 = 2131239927(0x7f0823f7, float:1.8096175E38)
        L1a:
            java.lang.Object r0 = r11.A00
            X.5QE r0 = (X.C5QE) r0
            if (r0 == 0) goto L29
            X.C14360o3.A07(r1)
            java.lang.String r0 = X.BHX.A03(r1, r0)
            if (r0 != 0) goto L30
        L29:
            r0 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r0 = X.AbstractC77623dm.A0F(r12, r0)
        L30:
            X.02u r5 = X.C10E.A00(r0)
            r3 = 0
            X.DnC r0 = r10.A02
            boolean r0 = r0.CDf()
            if (r0 == 0) goto L54
            X.3ay r0 = X.C51722Yv.A02
            java.lang.Integer r2 = X.C05F.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            X.9CT r0 = X.AbstractC25225BEi.A0m(r2, r1, r0)
            X.2Yv r3 = X.AbstractC25234BEr.A0B(r3, r0, r1)
            if (r13 != 0) goto L54
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            X.AbstractC77623dm.A0D(r12, r0)
        L54:
            r8 = 0
            java.lang.Object r4 = r11.A01
            X.0sZ r4 = (X.InterfaceC16820sZ) r4
            r9 = 232(0xe8, float:3.25E-43)
            X.BVK r2 = new X.BVK
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVL.A04(X.Mti, X.2Z1, boolean):X.BVK");
    }
}
