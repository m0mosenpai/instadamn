package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Miz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51156Miz extends C2UU {
    public C54597O9y A00;
    public final int A01;
    public final Context A02;

    public C51156Miz(Context context, int i) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
        this.A01 = i;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        Bitmap AzJ;
        C14360o3.A0B(c3oo, 0);
        C54597O9y c54597O9y = this.A00;
        if (c54597O9y == null) {
            C14360o3.A0F("renderItemProvider");
            throw C00O.createAndThrow();
        }
        List list = c54597O9y.A02;
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = c54597O9y.A01;
        C51272Mkv c51272Mkv = (C51272Mkv) c3oo;
        View A06 = AbstractC31171DnF.A06(c51272Mkv);
        ViewGroup.LayoutParams layoutParams = A06.getLayoutParams();
        if (layoutParams != null) {
            int i2 = c51272Mkv.A01;
            layoutParams.width = i2;
            int i3 = c51272Mkv.A00;
            layoutParams.height = i3;
            A06.setLayoutParams(layoutParams);
            c51272Mkv.itemView.setBackground(null);
            InterfaceC58195Pr1 interfaceC58195Pr1 = (InterfaceC58195Pr1) list.get(i);
            if (C18U.A06(C06090Tz.A05, viewOnTouchListenerC51201Mjl.A0F, 36315451727875319L)) {
                interfaceC58195Pr1.Ag8(c51272Mkv, i2, i3);
                return;
            }
            String BkZ = interfaceC58195Pr1.BkZ();
            if (BkZ != null) {
                AzJ = BitmapFactory.decodeFile(BkZ);
            } else {
                AzJ = interfaceC58195Pr1.AzJ(i2, i3);
            }
            View view = c51272Mkv.itemView;
            view.setBackground(new BitmapDrawable(view.getResources(), AzJ));
            return;
        }
        throw AbstractC166987dD.A15("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51272Mkv(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.reorder_cover_frame_item, false), A01(), A00());
    }

    public final int A00() {
        Integer num;
        Resources resources;
        int i;
        int i2 = this.A01;
        if (i2 != 1) {
            if (i2 != 2) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A01;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            resources = this.A02.getResources();
            if (intValue != 1) {
                i = R.dimen.asset_picker_video_sticker_width;
            } else {
                i = R.dimen.ai_agent_embodiment_video_container_size;
            }
        } else {
            resources = this.A02.getResources();
            i = R.dimen.avatar_sticker_max_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    public final int A01() {
        Integer num;
        Resources resources;
        int i;
        int i2 = this.A01;
        if (i2 != 1) {
            if (i2 != 2) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A01;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            resources = this.A02.getResources();
            if (intValue != 1) {
                i = R.dimen.ai_agent_embodiment_video_container_size;
            } else {
                i = R.dimen.ab_test_media_thumbnail_preview_item_width;
            }
        } else {
            resources = this.A02.getResources();
            i = R.dimen.ad_not_delivering_thumbnail_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1855891915);
        C54597O9y c54597O9y = this.A00;
        if (c54597O9y == null) {
            C14360o3.A0F("renderItemProvider");
            throw C00O.createAndThrow();
        }
        int i = c54597O9y.A00;
        C0f9.A0A(-280756255, A03);
        return i;
    }
}
