package com.google.android.exoplayer2.metadata.id3;

import X.C4B6;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes10.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0015, blocks: (B:11:0x00b0, B:18:0x00f5, B:20:0x00fe, B:21:0x0104, B:82:0x014b), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0015, blocks: (B:11:0x00b0, B:18:0x00f5, B:20:0x00fe, B:21:0x0104, B:82:0x014b), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void E4k(X.C4W7 r9) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Frame.E4k(X.4W7):void");
    }

    public String toString() {
        return this.A00;
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }
}
