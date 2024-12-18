package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.OyA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56263OyA implements C8FV {
    public final C8FY A00;
    public final Context A01;

    @Override // X.C8FV
    public final boolean EiV() {
        return false;
    }

    @Override // X.C8FV
    public final boolean Eiu() {
        return false;
    }

    @Override // X.C8FV
    public final int B1J() {
        return 0;
    }

    @Override // X.C8FV
    public final String B1K() {
        return AbstractC166997dE.A0p(this.A01, 2131975787);
    }

    @Override // X.C8FV
    public final /* bridge */ /* synthetic */ Drawable B1L() {
        return this.A00;
    }

    @Override // X.C8FV
    public final /* synthetic */ String Bsb() {
        return null;
    }

    public C56263OyA(Context context) {
        this.A01 = context;
        Drawable drawable = context.getDrawable(R.drawable.effect_no_selection);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        this.A00 = new C8FY(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
    }
}
