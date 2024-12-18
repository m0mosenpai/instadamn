package com.instagram.contentprovider;

import X.AbstractC09440dt;
import X.AbstractC58329PtM;
import X.C00O;
import X.C14360o3;
import X.C9E0;
import X.InterfaceC09390do;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

/* loaded from: classes10.dex */
public final class AsyncFamilyAppsUserValuesProvider extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate {
        public final InterfaceC09390do A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
            this.A00 = AbstractC09440dt.A01(new C9E0(abstractC58329PtM, 28));
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            C14360o3.A0B(uri, 0);
            return ((ContentProvider) this.A00.getValue()).update(uri, contentValues, str, strArr);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            C14360o3.A0B(uri, 0);
            return ((ContentProvider) this.A00.getValue()).delete(uri, str, strArr);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C14360o3.A0B(uri, 0);
            return ((ContentProvider) this.A00.getValue()).query(uri, strArr, str, strArr2, str2);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            C14360o3.A0B(uri, 0);
            C14360o3.A0B(contentValues, 1);
            ((ContentProvider) this.A00.getValue()).insert(uri, contentValues);
            throw C00O.createAndThrow();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            C14360o3.A0B(uri, 0);
            ((ContentProvider) this.A00.getValue()).getType(uri);
            throw C00O.createAndThrow();
        }
    }
}
