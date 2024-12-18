package androidx.media3.extractor.metadata.scte35;

import X.AbstractC31173DnH;
import X.AnonymousClass001;
import X.Y15;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return AnonymousClass001.A0R("SCTE-35 splice command: type=", AbstractC31173DnH.A0q(this));
    }
}
