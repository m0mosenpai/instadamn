package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.MiP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51120MiP extends C2UU {
    public final List A00;

    public C51120MiP(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51301MlO(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.media_kit_info_sheet_item, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51301MlO c51301MlO = (C51301MlO) c3oo;
        int i2 = 0;
        C14360o3.A0B(c51301MlO, 0);
        MediaKitInfoSheetItemModel mediaKitInfoSheetItemModel = (MediaKitInfoSheetItemModel) this.A00.get(i);
        C14360o3.A0B(mediaKitInfoSheetItemModel, 0);
        IgSimpleImageView igSimpleImageView = c51301MlO.A02;
        Integer num = mediaKitInfoSheetItemModel.A02;
        igSimpleImageView.setVisibility(MSY.A04(num));
        TextView textView = c51301MlO.A01;
        Integer num2 = mediaKitInfoSheetItemModel.A03;
        textView.setVisibility(MSY.A04(num2));
        TextView textView2 = c51301MlO.A00;
        Integer num3 = mediaKitInfoSheetItemModel.A01;
        if (num3 == null) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        if (num != null) {
            AbstractC166997dE.A19(AbstractC31172DnG.A05(c51301MlO), igSimpleImageView, num.intValue());
        }
        if (num2 != null) {
            textView.setText(num2.intValue());
        }
        if (num3 != null) {
            int intValue = num3.intValue();
            Context A05 = AbstractC31172DnG.A05(c51301MlO);
            Object[] objArr = mediaKitInfoSheetItemModel.A00;
            String string = A05.getString(intValue, Arrays.copyOf(objArr, objArr.length));
            C14360o3.A07(string);
            textView2.setText(string);
        }
        textView2.setMovementMethod(new LinkMovementMethod());
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-395508054);
        int size = this.A00.size();
        C0f9.A0A(-1899413950, A03);
        return size;
    }
}
