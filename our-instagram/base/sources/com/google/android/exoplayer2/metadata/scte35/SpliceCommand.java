package com.google.android.exoplayer2.metadata.scte35;

import X.AbstractC31173DnH;
import X.AnonymousClass001;
import X.C4B6;
import X.C4W7;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes10.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void E4k(C4W7 c4w7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] CHv() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ C4B6 CHw() {
        return null;
    }

    public final String toString() {
        return AnonymousClass001.A0R("SCTE-35 splice command: type=", AbstractC31173DnH.A0q(this));
    }
}
