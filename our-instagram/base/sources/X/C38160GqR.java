package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GqR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38160GqR extends C3OO {
    public final IgImageButton A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38160GqR(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View findViewById = view.findViewById(R.id.image_button);
        C14360o3.A07(findViewById);
        this.A00 = (IgImageButton) findViewById;
    }
}
