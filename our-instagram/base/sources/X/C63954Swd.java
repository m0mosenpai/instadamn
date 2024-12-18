package X;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;

/* renamed from: X.Swd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63954Swd implements InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public C62956SYy A01;
    public final BCL A02;
    public final InterfaceC172717mh A04;
    public final HashSet A05;
    public final boolean A06;
    public final boolean A07;
    public boolean A00 = false;
    public final C62417SAr A03 = new C62417SAr();

    @Override // X.InterfaceC65638Tq1
    public final void AQC(QF6 qf6, String str, boolean z) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void Cso(QF6 qf6) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void DBE(QF6 qf6) {
    }

    @Override // X.BCM
    public final void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void DPh(QF6 qf6, String str) {
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXT(QF6 qf6, String str) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void DXW(QF6 qf6, long j) {
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXd(String str) {
        this.A00 = false;
    }

    @Override // X.InterfaceC65639Tq2
    public final void DuA(MotionEvent motionEvent, View view) {
    }

    @Override // X.InterfaceC65638Tq1
    public final void Ej3(QF6 qf6, Boolean bool, Boolean bool2, String str) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void FE3(QF6 qf6) {
    }

    @Override // X.InterfaceC65639Tq2
    public final String getUrl() {
        return null;
    }

    @Override // X.InterfaceC65639Tq2
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    private boolean A00() {
        Intent intent;
        InterfaceC172717mh interfaceC172717mh = this.A04;
        if (interfaceC172717mh != null && (intent = interfaceC172717mh.getIntent()) != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(C023409i.A0A.A06(AbstractC13580mk.A00(intent)));
            return AbstractC167017dG.A1b(A00, A00.A7E, C23031Ai.A8c, 168);
        }
        return false;
    }

    @Override // X.InterfaceC65638Tq1
    public final boolean Eit(QF6 qf6, Boolean bool, Boolean bool2, String str) {
        if (this.A00) {
            return false;
        }
        return A01(qf6, str);
    }

    @Override // X.BCM
    public final void destroy() {
        InterfaceC172717mh interfaceC172717mh;
        String str;
        if (this.A06 && (interfaceC172717mh = this.A04) != null && interfaceC172717mh.C9a() != null && interfaceC172717mh.C9a().A0b) {
            QF6 C9a = interfaceC172717mh.C9a();
            if (C9a.A0b) {
                str = C9a.A0M;
            } else {
                str = null;
            }
            if (interfaceC172717mh.getIntent() != null) {
                InterfaceC65562Tmi A00 = AbstractC61736Rsr.A00(interfaceC172717mh.getIntent());
                if (str == null) {
                    str = "";
                }
                A00.CmW(str);
            }
        }
    }

    public C63954Swd(BCL bcl, InterfaceC172717mh interfaceC172717mh, HashSet hashSet, boolean z, boolean z2) {
        this.A04 = interfaceC172717mh;
        this.A02 = bcl;
        this.A05 = hashSet;
        this.A07 = z2;
        this.A06 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
    
        if (A00() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019f, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0bW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01(X.QF6 r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63954Swd.A01(X.QF6, java.lang.String):boolean");
    }

    @Override // X.InterfaceC65639Tq2
    public final boolean Eir(QF6 qf6, String str) {
        return A01(qf6, str);
    }
}
