package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;

/* renamed from: X.LXb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48252LXb implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "DirectViewReshareTogglePickerController";
    public ReshareTogglePickerView A00;
    public Integer A01;
    public final UserSession A02;
    public final Context A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_view_reshare_toggle_picker";
    }

    public C48252LXb(Context context, UserSession userSession, ReshareTogglePickerView reshareTogglePickerView, Integer num) {
        this.A03 = context;
        this.A02 = userSession;
        this.A00 = reshareTogglePickerView;
        this.A01 = num;
        AbstractC31172DnG.A1F(context.getResources(), reshareTogglePickerView.getLayoutParams(), R.dimen.account_group_management_clickable_width);
        ViewOnClickListenerC48063LPo.A00(this.A00, 22, this);
        this.A00.A00(this.A01);
    }
}
