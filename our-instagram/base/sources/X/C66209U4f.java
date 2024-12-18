package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.U4f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66209U4f implements InterfaceC65626Tpm, InterfaceC72763Nx, XBU {
    public int A00;
    public InterfaceC72763Nx A01;
    public AbstractC12990ll A02;
    public InterfaceC72001XEp A03;
    public XBX A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C57112jm A09;
    public final InterfaceC72040XGi A0A;
    public final IgBloksScreenConfig A0B;
    public final C71163Hc A0C;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        this.A01 = null;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66209U4f(android.content.Context r15, android.os.Bundle r16, X.C07T r17, X.InterfaceC72040XGi r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66209U4f.<init>(android.content.Context, android.os.Bundle, X.07T, X.XGi):void");
    }

    @Override // X.XBU
    public final C69750Vuk Aba() {
        String str = this.A06;
        if (str != null) {
            String str2 = this.A05;
            if (TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                } else {
                    str2 = "bloks_unknown";
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = "bloks_unknown_class";
            }
            C14360o3.A0A(str2);
            C14360o3.A0A(str);
            return new C69750Vuk(str2, str);
        }
        return null;
    }

    @Override // X.InterfaceC72763Nx
    public final void DfM(int i) {
        InterfaceC72763Nx interfaceC72763Nx = this.A01;
        if (interfaceC72763Nx != null) {
            interfaceC72763Nx.DfM(i);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C69503VpY c69503VpY;
        AbstractC12990ll abstractC12990ll;
        UserSession A01;
        IgBloksScreenConfig igBloksScreenConfig = this.A0B;
        if (igBloksScreenConfig != null && (c69503VpY = igBloksScreenConfig.A03) != null && (abstractC12990ll = this.A02) != null && (A01 = AbstractC03270Dk.A01(abstractC12990ll)) != null) {
            c69503VpY.A00(A01);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        if (this.A08) {
            C57112jm c57112jm = this.A09;
            C71163Hc c71163Hc = this.A0C;
            InterfaceC72040XGi interfaceC72040XGi = this.A0A;
            c57112jm.A08(((Fragment) interfaceC72040XGi).mView, c71163Hc, new InterfaceC57142jp[0]);
            InterfaceC72001XEp interfaceC72001XEp = this.A03;
            if (interfaceC72001XEp != null) {
                interfaceC72040XGi.E2M(interfaceC72001XEp, new U5A(this.A04, this.A00, this.A07));
                this.A03 = null;
            }
            this.A08 = false;
        }
        InterfaceC72040XGi interfaceC72040XGi2 = this.A0A;
        if (interfaceC72040XGi2 instanceof InterfaceC72763Nx) {
            this.A01 = (InterfaceC72763Nx) interfaceC72040XGi2;
        }
    }
}
