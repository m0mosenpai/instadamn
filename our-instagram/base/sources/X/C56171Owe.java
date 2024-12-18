package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Owe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56171Owe implements InterfaceC65702y7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C56171Owe(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC65702y7
    public final void EGm(Bitmap bitmap, IgImageView igImageView) {
        boolean A1a = AbstractC167017dG.A1a(igImageView, bitmap);
        C54662OCo c54662OCo = C55197Oe4.A00(this.A01).A00;
        if (c54662OCo != null) {
            int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height);
            bitmap = C1NC.A0C(bitmap, MX2.A06(MX2.A05(c54662OCo.A01, bitmap.getWidth(), bitmap.getHeight(), A1a ? 1 : 0, A1a ? 1 : 0)), dimensionPixelSize, dimensionPixelSize);
            C14360o3.A07(bitmap);
        }
        igImageView.setImageBitmap(bitmap);
    }
}
