package com.instagram.contentprovider;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58329PtM;
import X.C14360o3;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.secure.content.PublicContentDelegate;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class AndroidXAppInitializer extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new IllegalStateException("Not allowed.");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new IllegalStateException("Not allowed.");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            throw new IllegalStateException("Not allowed.");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new IllegalStateException("Not allowed.");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            throw new IllegalStateException("Not allowed.");
        }
    }

    @Override // X.AbstractC58329PtM
    public final boolean A0C() {
        try {
            Context context = getContext();
            Class<?> cls = Class.forName("androidx.startup.InitializationProvider");
            C14360o3.A0A(context);
            ComponentName componentName = new ComponentName(context, cls);
            Bundle A0b = AbstractC166987dD.A0b();
            if (context.getPackageManager() != null) {
                ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(componentName, 128);
                C14360o3.A07(providerInfo);
                A0b = ((PackageItemInfo) providerInfo).metaData;
                if (A0b != null) {
                    A0b.remove("androidx.work.WorkManagerInitializer");
                }
            }
            Class<?> cls2 = Class.forName("androidx.startup.AppInitializer");
            Object invoke = cls2.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            Method declaredMethod = cls2.getDeclaredMethod("discoverAndInitialize", Bundle.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(invoke, A0b);
            return false;
        } catch (Throwable th) {
            throw AbstractC58318PtA.A0f(th);
        }
    }
}
