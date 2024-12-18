package com.instagram.common.analytics.phoneid;

import X.AbstractC58329PtM;
import X.C11800je;
import X.C14360o3;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

/* loaded from: classes.dex */
public final class AsyncInstagramPhoneIdProvider extends AbstractC58329PtM {

    /* loaded from: classes.dex */
    public final class Impl extends PublicContentDelegate {
        public final C11800je A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
            this.A00 = new C11800je();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            C14360o3.A0B(uri, 0);
            C14360o3.A0B(contentValues, 1);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(strArr, 3);
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            C14360o3.A0B(uri, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(strArr, 2);
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C14360o3.A0B(uri, 0);
            C14360o3.A0B(strArr, 1);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(strArr2, 3);
            C14360o3.A0B(str2, 4);
            return this.A00.query(uri, strArr, str, strArr2, str2);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            C14360o3.A0B(uri, 0);
            C14360o3.A0B(contentValues, 1);
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            C14360o3.A0B(uri, 0);
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.AbstractC58329PtM
    public final void A07() {
    }
}
