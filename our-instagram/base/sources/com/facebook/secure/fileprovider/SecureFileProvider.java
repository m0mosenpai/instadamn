package com.facebook.secure.fileprovider;

import X.AbstractC102054iQ;
import X.AbstractC166997dE;
import X.AbstractC58317Pt9;
import X.AbstractC58329PtM;
import X.AnonymousClass001;
import X.C58331PtP;
import X.InterfaceC08100bW;
import X.OX5;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class SecureFileProvider extends AbstractC58329PtM {
    public C58331PtP A00;

    /* loaded from: classes2.dex */
    public class Impl extends AbstractC102054iQ {
        public static final InterfaceC08100bW A01 = new Object();
        public static final String[] A02 = {"_display_name", "_size"};
        public final SecureFileProvider A00;

        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            this.A00 = (SecureFileProvider) abstractC58329PtM;
        }

        @Override // X.AbstractC102054iQ
        public final ParcelFileDescriptor A0D(Uri uri, String str) {
            int i;
            OX5 A00 = OX5.A00(uri);
            AbstractC58329PtM abstractC58329PtM = super.A00;
            if (A00.A04(abstractC58329PtM.getContext()).booleanValue()) {
                try {
                    File A022 = A00.A02(abstractC58329PtM.getContext(), uri);
                    if ("r".equals(str)) {
                        i = 268435456;
                    } else if (!"w".equals(str) && !"wt".equals(str)) {
                        if ("wa".equals(str)) {
                            i = 704643072;
                        } else if ("rw".equals(str)) {
                            i = 939524096;
                        } else if ("rwt".equals(str)) {
                            i = 1006632960;
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC58317Pt9.A00(187), str));
                        }
                    } else {
                        i = 738197504;
                    }
                    return ParcelFileDescriptor.open(A022, i);
                } catch (FileNotFoundException e) {
                    throw e;
                } catch (IOException e2) {
                    A01.EHA("SecureFileProvider.Impl", "IOException during file opening.", e2);
                    throw new FileNotFoundException("Could not open file");
                }
            }
            throw new SecurityException("Access denied");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, java.lang.Object] */
    public static boolean A01(Context context, Uri uri) {
        HashMap hashMap = C58331PtP.A06;
        C58331PtP A01 = C58331PtP.A01(context, null, new Object());
        try {
            if (A01.A02.equals(uri.getAuthority()) && uri.getScheme().equals("content")) {
                A01.A05(uri, AbstractC166997dE.A0a());
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0bW, java.lang.Object] */
    @Override // X.AbstractC58329PtM
    public final void A0G(Context context, ProviderInfo providerInfo) {
        if (!((ComponentInfo) providerInfo).exported) {
            HashMap hashMap = C58331PtP.A06;
            this.A00 = C58331PtP.A01(context, providerInfo, new Object());
            return;
        }
        throw new SecurityException("Provider must not be exported.");
    }
}
