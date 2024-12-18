package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OCM {
    public final View A00;
    public final TextView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC147526kd A03;

    /* JADX WARN: Multi-variable type inference failed */
    public OCM(View view, C07X c07x, InterfaceC018407e interfaceC018407e) {
        C14360o3.A0B(interfaceC018407e, 1);
        this.A02 = Ny8.A00(new Om2(), interfaceC018407e, AbstractC25225BEi.A1D(C51048Mh0.class));
        View requireViewById = view.requireViewById(R.id.message_composer_container);
        AbstractC166997dE.A18(requireViewById.getContext(), requireViewById, 2131971749);
        this.A00 = requireViewById;
        this.A01 = AbstractC167007dF.A0N(view, R.id.composer_text);
        View requireViewById2 = view.requireViewById(R.id.reel_view_group);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type com.instagram.reels.listener.StoryViewerGestureProvider");
        InterfaceC147526kd interfaceC147526kd = (InterfaceC147526kd) requireViewById2;
        this.A03 = interfaceC147526kd;
        C07T lifecycle = c07x.getLifecycle();
        EnumC53107NeK enumC53107NeK = EnumC53107NeK.A02;
        C30750Dfn c30750Dfn = new C30750Dfn(this, 23);
        AbstractC167017dG.A1N(interfaceC147526kd, lifecycle);
        C54476O5e c54476O5e = (C54476O5e) AbstractC47892LDm.A00(lifecycle).A00.getValue();
        Map map = c54476O5e.A00;
        boolean A1M = AbstractC167007dF.A1M(map.isEmpty() ? 1 : 0);
        map.put(enumC53107NeK, c30750Dfn);
        interfaceC147526kd.A97(new C56540P8m(c54476O5e, A1M));
        Ok3.A00(requireViewById, 55, this);
        C57158PZc.A02(c07x, this, AbstractC25229BEm.A0a(c07x), 15);
    }
}
