package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V3L extends AbstractC168697g3 {
    public final Context A00;
    public final LayoutInflater A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3L(Context context) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-1402519856);
        if (view == null) {
            view = this.A01.inflate(R.layout.reporting_bottom_sheet_title_row, (ViewGroup) null);
            view.setTag(new VgQ(view));
        }
        Context context = this.A00;
        VgQ vgQ = (VgQ) AbstractC31172DnG.A0x(view);
        String str = (String) obj;
        C69312VlK c69312VlK = (C69312VlK) obj2;
        Resources resources = context.getResources();
        View view2 = vgQ.A00;
        Integer num = c69312VlK.A03;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        Integer num2 = c69312VlK.A00;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int i4 = 0;
        view2.setPadding(0, dimensionPixelSize, 0, resources.getDimensionPixelSize(i3));
        if (c69312VlK.A01 != null) {
            vgQ.A01.setTextSize(0, resources.getDimensionPixelSize(r0.intValue()));
        }
        TextView textView = vgQ.A01;
        textView.setText(str);
        if (c69312VlK.A04) {
            i4 = 17;
        }
        textView.setGravity(i4);
        C0f9.A0A(979743161, A03);
        return view;
    }
}
