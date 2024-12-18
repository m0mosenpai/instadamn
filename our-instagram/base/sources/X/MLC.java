package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class MLC extends C0YY implements InterfaceC16660sJ {
    public static final MLC A00 = new MLC();

    public MLC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Medium medium = (Medium) obj;
        C14360o3.A0B(medium, 0);
        return Boolean.valueOf(AbstractC167007dF.A1O((medium.A0D > 0L ? 1 : (medium.A0D == 0L ? 0 : -1))));
    }
}
