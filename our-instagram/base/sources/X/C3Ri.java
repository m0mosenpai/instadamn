package X;

/* renamed from: X.3Ri, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Ri implements InterfaceC73573Rj {
    public final C59812oO A00;
    public final java.util.Set A01;

    @Override // X.InterfaceC73573Rj
    public final void E6y(String str, String str2, long j) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        byte[] bytes = str2.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        C59812oO c59812oO = this.A00;
        c59812oO.write(str, bytes);
        c59812oO.A00.A00.A04(str, Long.valueOf(System.currentTimeMillis() + j), "eviction_timestamps");
    }

    @Override // X.InterfaceC73573Rj
    public final String getString(String str) {
        C14360o3.A0B(str, 0);
        C59812oO c59812oO = this.A00;
        if (c59812oO.hasKey(str)) {
            byte[] readResourceToMemory = c59812oO.readResourceToMemory(str);
            if (readResourceToMemory == null) {
                readResourceToMemory = new byte[0];
            }
            return new String(readResourceToMemory, C15W.A05);
        }
        throw new Exception("no such key");
    }

    public C3Ri(C59812oO c59812oO) {
        this.A00 = c59812oO;
        c59812oO.getItemCount();
        java.util.Set allKeys = c59812oO.getAllKeys();
        C14360o3.A07(allKeys);
        this.A01 = allKeys;
        c59812oO.getSizeBytes();
    }
}
