package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Pjw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57769Pjw extends C0YY implements InterfaceC16610sE {
    public static final C57769Pjw A00 = new C57769Pjw();

    public C57769Pjw() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        AbstractC167007dF.A1K(viewGroup, obj2);
        List list = AbstractC51358MmJ.A00;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        EnumC53114NeR enumC53114NeR = EnumC53114NeR.A03;
        int i = R.layout.layout_stacked_timeline_bottom_sheet_tts_voice_grid_item;
        if (obj2 == enumC53114NeR) {
            i = R.layout.layout_stacked_timeline_bottom_sheet_tts_voice_item;
        }
        return new NHZ(AbstractC25226BEj.A0R(A0P, viewGroup, i, false));
    }
}
