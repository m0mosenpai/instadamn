package X;

import android.app.PendingIntent;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC73993Tl {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC73993Tl[] A05;
    public static final EnumC73993Tl A06;
    public static final EnumC73993Tl A07;
    public long A00;
    public PendingIntent A01;
    public boolean A02;
    public final String A03;

    static {
        EnumC73993Tl enumC73993Tl = new EnumC73993Tl(0, "BatchUpload", "action_batch_upload", 300000L);
        A06 = enumC73993Tl;
        EnumC73993Tl enumC73993Tl2 = new EnumC73993Tl(1, "UploadRetry", "action_upload_retry", 3600000L);
        A07 = enumC73993Tl2;
        EnumC73993Tl[] enumC73993TlArr = {enumC73993Tl, enumC73993Tl2};
        A05 = enumC73993TlArr;
        A04 = AbstractC12190kN.A00(enumC73993TlArr);
    }

    public static EnumC73993Tl valueOf(String str) {
        return (EnumC73993Tl) Enum.valueOf(EnumC73993Tl.class, str);
    }

    public static EnumC73993Tl[] values() {
        return (EnumC73993Tl[]) A05.clone();
    }

    public EnumC73993Tl(int i, String str, String str2, long j) {
        this.A03 = str2;
        this.A00 = j;
    }
}
