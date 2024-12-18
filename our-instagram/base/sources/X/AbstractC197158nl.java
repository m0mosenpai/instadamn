package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* renamed from: X.8nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197158nl {
    public static final InterfaceC197178nn A00(Context context, C183978Ee c183978Ee) {
        InterfaceC197178nn c197168nm;
        final boolean z = false;
        C14360o3.A0B(c183978Ee, 0);
        final boolean z2 = true;
        C14360o3.A0B(context, 1);
        final byte[] bArr = c183978Ee.A1C;
        if (bArr != null) {
            final String str = c183978Ee.A0h;
            final int i = c183978Ee.A09;
            final int i2 = c183978Ee.A06;
            c197168nm = new InterfaceC197178nn(str, bArr, i, i2, z) { // from class: X.8nS
                public Boolean A00;
                public final boolean A01;
                public final byte[] A02;
                public final int A03;
                public final int A04;
                public final String A05;

                @Override // X.InterfaceC197178nn
                public final Bitmap AWj(int i3, int i4, boolean z3) {
                    throw new UnsupportedOperationException();
                }

                @Override // X.InterfaceC197178nn
                public final String Avl() {
                    return null;
                }

                @Override // X.InterfaceC197178nn
                public final int AwT() {
                    return 0;
                }

                @Override // X.InterfaceC197178nn
                public final byte[] BGb() {
                    return this.A02;
                }

                @Override // X.InterfaceC197178nn
                public final android.net.Uri Ba0() {
                    return null;
                }

                @Override // X.InterfaceC197178nn
                public final boolean CXA() {
                    return this.A01;
                }

                @Override // X.InterfaceC197178nn
                public final boolean Cev() {
                    Boolean bool = this.A00;
                    if (bool == null && this.A01) {
                        bool = Boolean.valueOf(AKG.A00(new InputStreamReader(new ByteArrayInputStream(this.A02))));
                        this.A00 = bool;
                    }
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    return false;
                }

                @Override // X.InterfaceC197178nn
                public final int getHeight() {
                    return this.A03;
                }

                @Override // X.InterfaceC197178nn
                public final String getTitle() {
                    return this.A05;
                }

                @Override // X.InterfaceC197178nn
                public final android.net.Uri getUri() {
                    throw new UnsupportedOperationException();
                }

                @Override // X.InterfaceC197178nn
                public final int getWidth() {
                    return this.A04;
                }

                {
                    this.A05 = str;
                    this.A04 = i;
                    this.A03 = i2;
                    this.A02 = bArr;
                    this.A01 = z;
                }

                @Override // X.InterfaceC197178nn
                public final /* synthetic */ Bitmap E35(int i3, boolean z3) {
                    return null;
                }
            };
        } else {
            final byte[] bArr2 = c183978Ee.A1B;
            if (bArr2 != null) {
                final String str2 = c183978Ee.A0h;
                final int i3 = c183978Ee.A09;
                final int i4 = c183978Ee.A06;
                c197168nm = new InterfaceC197178nn(str2, bArr2, i3, i4, z2) { // from class: X.8nS
                    public Boolean A00;
                    public final boolean A01;
                    public final byte[] A02;
                    public final int A03;
                    public final int A04;
                    public final String A05;

                    @Override // X.InterfaceC197178nn
                    public final Bitmap AWj(int i32, int i42, boolean z3) {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceC197178nn
                    public final String Avl() {
                        return null;
                    }

                    @Override // X.InterfaceC197178nn
                    public final int AwT() {
                        return 0;
                    }

                    @Override // X.InterfaceC197178nn
                    public final byte[] BGb() {
                        return this.A02;
                    }

                    @Override // X.InterfaceC197178nn
                    public final android.net.Uri Ba0() {
                        return null;
                    }

                    @Override // X.InterfaceC197178nn
                    public final boolean CXA() {
                        return this.A01;
                    }

                    @Override // X.InterfaceC197178nn
                    public final boolean Cev() {
                        Boolean bool = this.A00;
                        if (bool == null && this.A01) {
                            bool = Boolean.valueOf(AKG.A00(new InputStreamReader(new ByteArrayInputStream(this.A02))));
                            this.A00 = bool;
                        }
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    }

                    @Override // X.InterfaceC197178nn
                    public final int getHeight() {
                        return this.A03;
                    }

                    @Override // X.InterfaceC197178nn
                    public final String getTitle() {
                        return this.A05;
                    }

                    @Override // X.InterfaceC197178nn
                    public final android.net.Uri getUri() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // X.InterfaceC197178nn
                    public final int getWidth() {
                        return this.A04;
                    }

                    {
                        this.A05 = str2;
                        this.A04 = i3;
                        this.A03 = i4;
                        this.A02 = bArr2;
                        this.A01 = z2;
                    }

                    @Override // X.InterfaceC197178nn
                    public final /* synthetic */ Bitmap E35(int i32, boolean z3) {
                        return null;
                    }
                };
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                C14360o3.A07(contentResolver);
                String A06 = c183978Ee.A06();
                LruCache lruCache = AbstractC08820cl.A00;
                android.net.Uri parse = android.net.Uri.parse(A06);
                C14360o3.A07(parse);
                c197168nm = new C197168nm(contentResolver, parse, null);
            }
        }
        return c197168nm;
    }
}
