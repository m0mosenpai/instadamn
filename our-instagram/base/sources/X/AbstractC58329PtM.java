package X;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.facebook.common.dextricks.DexStore;
import com.instagram.contentprovider.AndroidXAppInitializer;
import com.instagram.contentprovider.AsyncFamilyAppsUserValuesProvider;
import com.instagram.contentprovider.AsyncNavChainProvider;
import com.instagram.contentprovider.DeferredCurrentUserProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.PtM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58329PtM extends ContentProvider {
    public static InterfaceC65371Tj3 A03 = new C58330PtN();
    public static String A04;
    public static volatile C2M3 A05;
    public AbstractC102054iQ A00;
    public boolean A01 = false;
    public volatile ProviderInfo A02;

    public static synchronized AbstractC102054iQ A00(AbstractC58329PtM abstractC58329PtM) {
        AbstractC102054iQ abstractC102054iQ;
        synchronized (abstractC58329PtM) {
            if (abstractC58329PtM.A01 && A04 == null) {
                A04 = abstractC58329PtM.getClass().getName();
            } else {
                abstractC58329PtM.A01 = true;
            }
            abstractC102054iQ = abstractC58329PtM.A00;
            if (abstractC102054iQ == null) {
                abstractC58329PtM.A07();
                try {
                    abstractC102054iQ = (AbstractC102054iQ) Class.forName(AnonymousClass001.A0R(abstractC58329PtM.getClass().getName(), "$Impl")).getDeclaredConstructor(AbstractC58329PtM.class).newInstance(abstractC58329PtM);
                    abstractC58329PtM.A00 = abstractC102054iQ;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                    throw new IllegalArgumentException(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    if (e instanceof RuntimeException) {
                        throw e;
                    }
                    throw new RuntimeException(e);
                }
            }
        }
        return abstractC102054iQ;
    }

    public boolean A0C() {
        return false;
    }

    public void A0G(Context context, ProviderInfo providerInfo) {
    }

    public void A07() {
        if (!(this instanceof DeferredCurrentUserProvider) && !(this instanceof AsyncNavChainProvider) && !(this instanceof AsyncFamilyAppsUserValuesProvider) && !(this instanceof AndroidXAppInitializer)) {
            AbstractC08170bf.A00();
        }
    }

    @Override // android.content.ContentProvider
    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        String str;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "applyBatch", str);
        return A00(this).A0K(arrayList);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.A02 = providerInfo;
        super.attachInfo(context, providerInfo);
        A0G(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int bulkInsert(android.net.Uri uri, ContentValues[] contentValuesArr) {
        String str;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "bulkInsert", str);
        return A00(this).A06(uri, contentValuesArr);
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "call", str3);
        return A00(this).A0C(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, String str, String[] strArr) {
        String str2;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "delete", str2);
        return A00(this).A05(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, ContentValues contentValues) {
        String str;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str = getCallingPackage();
        } catch (SecurityException unused) {
            str = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "insert", str);
        return A00(this).A0B(uri, contentValues);
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (AbstractC08170bf.A00.block(-1L)) {
            A00(this).A0F();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (AbstractC08170bf.A00.block(-1L)) {
            A00(this).A0H(i);
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(android.net.Uri uri, String str) {
        String str2;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "openAssetFile", str2);
        return A00(this).A07(uri, str);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(android.net.Uri uri, String str) {
        String str2;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "openFile", str2);
        return A00(this).A0D(uri, str);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(android.net.Uri uri, String str, Bundle bundle) {
        String str2;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "openTypedAssetFile", str2);
        return A00(this).A08(uri, str, bundle);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        String str3;
        C0LG A01;
        String A052;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "queryWithCancellationSignal", str3);
        Cursor A0A = A00(this).A0A(uri, strArr, str, strArr2, str2, cancellationSignal);
        if (A05 != null) {
            getContext().getApplicationInfo();
            C2M3 c2m3 = A05;
            ProviderInfo providerInfo = this.A02;
            Context context2 = getContext();
            AbstractC25233BEq.A0v(0, uri, providerInfo, context2);
            if (c2m3.A02.CRj() && A0A != null) {
                InterfaceC02590Ai A0H = MSY.A0H(c2m3.A00, "mobile_privacy_uii_detection_data_read");
                if (A0H.isSampled()) {
                    java.util.Set set = c2m3.A04;
                    Object A0L = AbstractC001800i.A0L(AbstractC167007dF.A0m(AbstractC166987dD.A19(uri), ".", 0));
                    if (A0L == null) {
                        A0L = "";
                    }
                    if (!set.contains(A0L) && (A01 = AbstractC08470cB.A01(context2, null, null, DexStore.DAYS_TO_MS_FACTOR, 0L)) != null && (A052 = A01.A05()) != null && C2M8.A00.contains(AbstractC167007dF.A0h(A052))) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("key_value_pairs", S59.A00(A0A));
                        c0Zx.A06("storage_url", uri.toString());
                        c0Zx.A06("origin_class_name", ((PackageItemInfo) providerInfo).name);
                        c0Zx.A06("origin_authority", providerInfo.authority);
                        c0Zx.A06("caller_app_identity", A052);
                        A0H.AAQ(c0Zx, "android_shared_storage_payload");
                        A0H.A8R(EnumC46282KeE.SHAREDSTORAGE, "data_source_common_name");
                        A0H.A8R(RiQ.WRITE, "cross_app_data_access_context");
                        C0Zx c0Zx2 = new C0Zx();
                        c0Zx2.A01(EnumC46282KeE.CONTENTPROVIDER, "framework_name");
                        A0H.AAQ(c0Zx2, "data_source_info");
                        A0H.Cht();
                    }
                }
            }
        }
        return A0A;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str2 = getCallingPackage();
        } catch (SecurityException unused) {
            str2 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "update", str2);
        return A00(this).A04(uri, contentValues, str, strArr);
    }

    public final int A02(android.net.Uri uri, ContentValues[] contentValuesArr) {
        return super.bulkInsert(uri, contentValuesArr);
    }

    public final AssetFileDescriptor A03(android.net.Uri uri, String str) {
        return super.openAssetFile(uri, str);
    }

    public final AssetFileDescriptor A04(android.net.Uri uri, String str, Bundle bundle) {
        return super.openTypedAssetFile(uri, str, bundle);
    }

    public final Bundle A05(String str, String str2, Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    public final ParcelFileDescriptor A06(android.net.Uri uri, String str) {
        return super.openFile(uri, str);
    }

    public final void A08() {
        super.onLowMemory();
    }

    public final void A09() {
        super.shutdown();
    }

    public final void A0A(int i) {
        super.onTrimMemory(i);
    }

    public final void A0B(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final boolean A0D() {
        return super.isTemporary();
    }

    public final ContentProviderResult[] A0E(ArrayList arrayList) {
        return super.applyBatch(arrayList);
    }

    public final String[] A0F(android.net.Uri uri, String str) {
        return super.getStreamTypes(uri, str);
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(android.net.Uri uri, String str) {
        return A00(this).A0L(uri, str);
    }

    @Override // android.content.ContentProvider
    public final String getType(android.net.Uri uri) {
        return A00(this).A0E(uri);
    }

    @Override // android.content.ContentProvider
    public final boolean isTemporary() {
        return A00(this).A0J();
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        A00(this).A0I(configuration);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        A0C();
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        A00(this).A0G();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        InterfaceC65371Tj3 interfaceC65371Tj3 = A03;
        Context context = getContext();
        String A0h = MSY.A0h(this);
        try {
            str3 = getCallingPackage();
        } catch (SecurityException unused) {
            str3 = "SecurityException: calling package doesn't belong to the calling UID";
        }
        interfaceC65371Tj3.ChB(context, A0h, "query", str3);
        return A00(this).A09(uri, strArr, str, strArr2, str2);
    }
}
