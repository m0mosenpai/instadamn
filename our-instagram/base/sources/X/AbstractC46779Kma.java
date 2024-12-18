package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.Kma, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46779Kma {
    public static final float A00(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.cluster_item_horizontal_overlap_factor, typedValue, true);
        int i = typedValue.type;
        if (i == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(AnonymousClass001.A11("Resource ID #0x", Integer.toHexString(R.dimen.cluster_item_horizontal_overlap_factor), " type #0x", Integer.toHexString(i), " is not valid"));
    }
}
