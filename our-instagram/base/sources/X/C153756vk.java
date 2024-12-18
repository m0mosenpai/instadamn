package X;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153756vk implements C1M1 {
    public long A00;
    public String A01;
    public final C8JW A02;

    public C153756vk(C8JW c8jw, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = c8jw;
        this.A00 = System.currentTimeMillis() / 1000;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - this.A00 > TimeUnit.MINUTES.toSeconds(30L)) {
            this.A01 = UUID.randomUUID().toString();
        }
        this.A00 = currentTimeMillis;
        return this.A01;
    }
}
