package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214739fB extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RemixAudioControlFragment";
    public C183688Ct A00;
    public Integer A01;
    public boolean A02;
    public C2UU A03;
    public RecyclerView A04;
    public String A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "remix_audio_control_sheet";
    }

    private final boolean A00() {
        C183688Ct c183688Ct = this.A00;
        if (c183688Ct == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        if (!c183688Ct.A12.A03) {
            AnonymousClass874 anonymousClass874 = c183688Ct.A11;
            anonymousClass874.getClass();
            if (!anonymousClass874.A03) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r2 == X.C05F.A00) goto L12;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -357788917(0xffffffffeaac930b, float:-1.0431482E26)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r6)
            android.os.Bundle r2 = r5.mArguments
            X.C14360o3.A0A(r2)
            java.lang.String r0 = "other_username"
            java.lang.String r0 = X.AbstractC153636vY.A01(r2, r0)
            r5.A05 = r0
            java.lang.String r1 = "is_precapture"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r5.A02 = r0
            X.8Ct r1 = r5.A00
            java.lang.String r0 = "delegate"
            if (r1 != 0) goto L2e
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2e:
            X.874 r0 = r1.A12
            boolean r0 = r0.A00
            r3 = r0 ^ 1
            X.874 r1 = r1.A11
            r1.getClass()
            boolean r0 = r1.A00
            if (r0 != 0) goto L4a
            java.lang.Integer r2 = r1.A01()
            java.lang.Integer r0 = X.C05F.A0C
            if (r2 == r0) goto L4a
            java.lang.Integer r1 = X.C05F.A00
            r0 = 1
            if (r2 != r1) goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r3 == 0) goto L5d
            if (r0 == 0) goto L5a
            java.lang.Integer r0 = X.C05F.A0C
        L51:
            r5.A01 = r0
            r0 = 1241459738(0x49ff2c1a, float:2090371.2)
            X.C0f9.A09(r0, r4)
            return
        L5a:
            java.lang.Integer r0 = X.C05F.A00
            goto L51
        L5d:
            if (r0 == 0) goto L62
            java.lang.Integer r0 = X.C05F.A01
            goto L51
        L62:
            java.lang.Integer r0 = X.C05F.A0N
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214739fB.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        if (A00() != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214739fB.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int i;
        String str;
        int A02 = C0f9.A02(294761214);
        super.onStop();
        if (this.A01 == null) {
            i = 2109499050;
        } else {
            if (this.A02 && !AbstractC226389yv.A00(requireContext())) {
                Integer num = this.A01;
                if (num == null) {
                    str = "currentRemixAudioSelection";
                } else if (num == C05F.A0C) {
                    Context requireContext = requireContext();
                    String str2 = this.A05;
                    if (str2 == null) {
                        str = "otherUsername";
                    } else {
                        C9GR.A03(requireContext, getString(2131974490, str2), null, 1);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            i = 347204203;
        }
        C0f9.A09(i, A02);
    }
}
