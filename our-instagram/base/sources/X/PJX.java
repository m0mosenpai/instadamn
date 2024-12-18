package X;

import android.R;

/* loaded from: classes9.dex */
public abstract class PJX implements MRA {
    @Override // X.MRA
    public void Czw(boolean z) {
    }

    @Override // X.MRA
    public void Dfe() {
    }

    @Override // X.MRA
    public void DpY(String str, String str2, String str3) {
    }

    @Override // X.MRA
    public void DpZ(String str) {
    }

    @Override // X.MRA
    public final void Dfh(String str) {
        if (this instanceof C53025Ncx) {
            C53025Ncx c53025Ncx = (C53025Ncx) this;
            C55907Ory c55907Ory = c53025Ncx.A00;
            String str2 = c53025Ncx.A01;
            if (c55907Ory.A0C.A04) {
                str2 = "";
            }
            C006802i c006802i = C006802i.A0p;
            c006802i.markerStart(R.bool.lockscreen_isPortrait);
            c006802i.markerAnnotate(R.bool.lockscreen_isPortrait, "effect_id", str2);
            if (str == null) {
                str = "unknown";
            }
            c006802i.markerAnnotate(R.bool.lockscreen_isPortrait, "report_tag", str);
        }
    }
}
