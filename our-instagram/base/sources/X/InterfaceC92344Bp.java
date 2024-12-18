package X;

import java.util.Map;

/* renamed from: X.4Bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC92344Bp extends InterfaceC92354Bq {
    void changeHttpPriority(byte b, boolean z);

    @Override // X.InterfaceC92354Bq
    void close();

    @Override // X.InterfaceC92354Bq
    Map getResponseHeaders();

    @Override // X.InterfaceC92354Bq
    long open(C4C7 c4c7);

    @Override // X.InterfaceC92364Br
    int read(byte[] bArr, int i, int i2);
}
