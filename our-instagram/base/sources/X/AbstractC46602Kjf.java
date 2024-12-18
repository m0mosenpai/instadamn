package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;

/* renamed from: X.Kjf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46602Kjf {
    public static final CreatorLoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_creator_logging_data");
        if (parcelable != null) {
            return (CreatorLoggingData) parcelable;
        }
        throw AbstractC166997dE.A0g();
    }
}
