package X;

import com.instagram.music.common.model.LyricsPhrase;
import java.util.List;

/* renamed from: X.Wm9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70993Wm9 implements InterfaceC71984XDt {
    public final C38059Gom A00;

    public final List A00(int i) {
        if (i >= 0 && i < Bd3()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A02;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC71984XDt
    public final int AYr(int i) {
        return VW8.A00(this.A00.A00, i);
    }

    @Override // X.InterfaceC71984XDt
    public final String Bd2(int i) {
        if (i >= 0 && i < Bd3()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A01;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC71984XDt
    public final int Bd3() {
        return this.A00.A00.size();
    }

    @Override // X.InterfaceC71984XDt
    public final int Bzm(int i) {
        if (i >= 0 && i < Bd3()) {
            return ((LyricsPhrase) this.A00.A00.get(i)).A00;
        }
        throw AbstractC31172DnG.A0u();
    }

    public C70993Wm9(C38059Gom c38059Gom) {
        this.A00 = c38059Gom;
    }
}
