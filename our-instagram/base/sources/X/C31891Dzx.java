package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dzx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31891Dzx extends C2UU {
    public boolean A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final ArrayList A03 = AbstractC166987dD.A1E();
    public final ArrayList A04;
    public final List A05;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C31956E2k(AbstractC25226BEj.A0R(LayoutInflater.from(this.A01), viewGroup, R.layout.layout_clips_preloaded_settings_bottom_sheet_item, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C31956E2k c31956E2k = (C31956E2k) c3oo;
        C14360o3.A0B(c31956E2k, 0);
        ClipsPreloadedSettingItem clipsPreloadedSettingItem = (ClipsPreloadedSettingItem) AbstractC001800i.A0O(this.A05, i);
        if (clipsPreloadedSettingItem != null) {
            c31956E2k.A01.setText(clipsPreloadedSettingItem.A06);
            c31956E2k.A00.setText(clipsPreloadedSettingItem.A05);
            c31956E2k.A03.A0F(null, this.A02, clipsPreloadedSettingItem.A04);
            if (this.A00) {
                c31956E2k.A02.setChecked(false);
            }
            ViewOnClickListenerC35684FpJ.A00(c31956E2k.itemView, c31956E2k, this, clipsPreloadedSettingItem, 12);
        }
    }

    public C31891Dzx(Context context, InterfaceC11380iw interfaceC11380iw, List list) {
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A05 = list;
        this.A04 = AbstractC166987dD.A1F(list);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(310457046);
        int size = this.A05.size();
        C0f9.A0A(764457, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        C0f9.A0A(949716301, C0f9.A03(-800633250));
        return 0L;
    }
}
