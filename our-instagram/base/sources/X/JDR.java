package X;

import com.instagram.model.reels.Reel;

/* loaded from: classes7.dex */
public final class JDR extends C0YY implements InterfaceC16660sJ {
    public static final JDR A00 = new JDR();

    public JDR() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Reel reel = (Reel) obj;
        if (reel != null) {
            return reel.getId();
        }
        return null;
    }
}
