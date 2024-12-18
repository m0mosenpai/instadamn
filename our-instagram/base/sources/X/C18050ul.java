package X;

import android.content.ClipData;
import android.os.Bundle;
import android.view.ContentInfo;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.0ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18050ul implements InterfaceC006102b {
    public int A00;
    public int A01;
    public ClipData A02;
    public android.net.Uri A03;
    public Bundle A04;

    @Override // X.InterfaceC006102b
    public final C006302d AEN() {
        return new C006302d(new InterfaceC006202c(this) { // from class: X.0uh
            public final int A00;
            public final int A01;
            public final ClipData A02;
            public final android.net.Uri A03;
            public final Bundle A04;

            @Override // X.InterfaceC006202c
            public final ContentInfo CHu() {
                return null;
            }

            @Override // X.InterfaceC006202c
            public final ClipData Ao3() {
                return this.A02;
            }

            @Override // X.InterfaceC006202c
            public final int B6x() {
                return this.A00;
            }

            @Override // X.InterfaceC006202c
            public final android.net.Uri BNZ() {
                return this.A03;
            }

            @Override // X.InterfaceC006202c
            public final int Byc() {
                return this.A01;
            }

            @Override // X.InterfaceC006202c
            public final Bundle getExtras() {
                return this.A04;
            }

            public final String toString() {
                String str;
                String valueOf;
                String A0c;
                StringBuilder sb = new StringBuilder();
                sb.append("ContentInfoCompat{clip=");
                sb.append(this.A02.getDescription());
                sb.append(", source=");
                int i = this.A01;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.A00;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                android.net.Uri uri = this.A03;
                String str2 = "";
                if (uri == null) {
                    A0c = "";
                } else {
                    A0c = AnonymousClass001.A0c(", hasLinkUri(", ")", uri.toString().length());
                }
                sb.append(A0c);
                if (this.A04 != null) {
                    str2 = ", hasExtras";
                }
                sb.append(str2);
                sb.append("}");
                return sb.toString();
            }

            {
                ClipData clipData = this.A02;
                clipData.getClass();
                this.A02 = clipData;
                int i = this.A01;
                C02R.A01(i, 0, CacheBehaviorLogger.SOURCE, 5);
                this.A01 = i;
                int i2 = this.A00;
                if ((i2 & 1) == i2) {
                    this.A00 = i2;
                    this.A03 = this.A03;
                    this.A04 = this.A04;
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A11("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed"));
            }
        });
    }

    @Override // X.InterfaceC006102b
    public final void ERT(ClipData clipData) {
        this.A02 = clipData;
    }

    @Override // X.InterfaceC006102b
    public final void EUb(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC006102b
    public final void EYD(android.net.Uri uri) {
        this.A03 = uri;
    }

    @Override // X.InterfaceC006102b
    public final void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
