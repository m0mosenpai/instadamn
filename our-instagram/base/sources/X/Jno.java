package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class Jno extends C2UU {
    public final Context A00;
    public final InterfaceC16620sF A01;
    public final String[] A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = R.layout.direct_emoji_quick_reply_tray_v2_text_item;
        if (i == 0) {
            i2 = R.layout.direct_emoji_quick_reply_tray_v2_emoji_item;
        }
        return new C44638Jpi(AbstractC25227BEk.A0D(LayoutInflater.from(this.A00), viewGroup, i2, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44638Jpi c44638Jpi = (C44638Jpi) c3oo;
        C14360o3.A0B(c44638Jpi, 0);
        c44638Jpi.A00.setText(this.A02[i]);
        C0fQ.A00(new LOx(this, i, 3), c44638Jpi.itemView);
    }

    public Jno(Context context, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = context;
        this.A01 = interfaceC16620sF;
        String[] stringArray = context.getResources().getStringArray(R.array.direct_emoji_quick_reply_items_v2_emoji_1);
        C14360o3.A07(stringArray);
        String[] stringArray2 = context.getResources().getStringArray(R.array.direct_emoji_quick_reply_items_v2_emoji_2);
        C14360o3.A07(stringArray2);
        this.A02 = (String[]) AbstractC06960Yn.A0b(stringArray, stringArray2);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1371581056);
        int length = this.A02.length;
        C0f9.A0A(1627612011, A03);
        return length;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-605780661);
        int i2 = 1;
        if (AbstractC13670mt.A0D(this.A02[i])) {
            i2 = 0;
        }
        C0f9.A0A(54468810, A03);
        return i2;
    }
}
