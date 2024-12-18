package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Wp3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71168Wp3 implements InterfaceC30957DjE {
    public final /* synthetic */ C71603Jf A00;
    public final /* synthetic */ V0T A01;

    public C71168Wp3(C71603Jf c71603Jf, V0T v0t) {
        this.A01 = v0t;
        this.A00 = c71603Jf;
    }

    @Override // X.InterfaceC30957DjE
    public final void DtG(long j) {
        V0T v0t = this.A01;
        IgdsSwitch igdsSwitch = v0t.A0L;
        if (igdsSwitch == null) {
            C14360o3.A0F("quietModeToggle");
            throw C00O.createAndThrow();
        }
        V0T.A0D(v0t, j, this.A00.A00(), igdsSwitch.isChecked(), true);
    }
}
