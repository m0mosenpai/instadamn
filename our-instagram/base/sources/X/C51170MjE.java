package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MjE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51170MjE extends C2UU {
    public static final List A01 = AbstractC16960so.A1Q(Float.valueOf(48.0f), Float.valueOf(36.0f), Float.valueOf(24.0f), Float.valueOf(12.0f));
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51268Mkr(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.clips_template_browser_thumbnail, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51268Mkr c51268Mkr = (C51268Mkr) c3oo;
        C14360o3.A0B(c51268Mkr, 0);
        Bitmap bitmap = (Bitmap) AbstractC001800i.A0d(this.A00, 3).get(i);
        if (bitmap != null) {
            ImageView imageView = c51268Mkr.A00;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public /* synthetic */ C51170MjE(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1838774094);
        int size = AbstractC001800i.A0d(this.A00, 3).size();
        Integer valueOf = Integer.valueOf(size);
        int i = 3;
        if (size < 3 && valueOf != null) {
            i = size;
        }
        C0f9.A0A(-726805471, A03);
        return i;
    }

    public C51170MjE() {
    }
}
