package X;

import android.app.RemoteInput;

/* renamed from: X.XqB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72877XqB {
    public static int A00(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static void A01(RemoteInput.Builder builder, int i) {
        builder.setEditChoicesBeforeSending(i);
    }
}
