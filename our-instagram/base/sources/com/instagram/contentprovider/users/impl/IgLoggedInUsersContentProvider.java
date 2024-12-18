package com.instagram.contentprovider.users.impl;

import X.AbstractC37315GcH;
import X.AbstractC58329PtM;
import X.C14360o3;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes.dex */
public final class IgLoggedInUsersContentProvider extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate {
        public static final String[] A00 = {CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "authorization_token", AbstractC37315GcH.A00(19, 8, 112), "profile_pic_url", "is_active_user"};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
        
            if (r3.getPackageManager().checkSignatures(r1, r2) == 0) goto L6;
         */
        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.database.Cursor A0Q(android.net.Uri r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19) {
            /*
                r14 = this;
                X.PtM r0 = r14.A00
                android.content.Context r3 = r0.getContext()
                X.C14360o3.A07(r3)
                int r2 = android.os.Binder.getCallingUid()
                android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
                int r1 = r0.uid
                if (r2 == r1) goto L20
                android.content.pm.PackageManager r0 = r3.getPackageManager()
                int r1 = r0.checkSignatures(r1, r2)
                r0 = 0
                if (r1 != 0) goto L21
            L20:
                r0 = 1
            L21:
                r9 = 0
                if (r0 != 0) goto L25
                return r9
            L25:
                X.2ZO r0 = X.C2ZO.A01
                r0.A01()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                X.09Y r0 = X.C023409i.A0A
                X.0vv r10 = r0.A05(r14)
                boolean r0 = r10 instanceof com.instagram.common.session.UserSession
                if (r0 == 0) goto L46
                X.0Bo r0 = X.C0BQ.A00(r10)
                java.util.List r11 = r0.BOe()
                r0 = r10
                com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
                java.lang.String r9 = r0.userId
            L46:
                java.lang.String[] r0 = com.instagram.contentprovider.users.impl.IgLoggedInUsersContentProvider.Impl.A00
                android.database.MatrixCursor r8 = new android.database.MatrixCursor
                r8.<init>(r0)
                int r7 = r11.size()
                r6 = 0
                r5 = 0
            L53:
                if (r5 >= r7) goto L95
                java.lang.Object r13 = r11.get(r5)
                com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
                java.lang.String r12 = r13.getId()
                X.C14360o3.A0B(r10, r6)
                X.1FA r0 = X.C1F8.A00(r10)
                X.0xq r1 = r0.A00
                java.lang.String r0 = ""
                java.lang.String r4 = r1.getString(r12, r0)
                if (r9 == 0) goto L77
                boolean r0 = r9.equals(r12)
                r3 = 1
                if (r0 != 0) goto L78
            L77:
                r3 = 0
            L78:
                java.lang.String r2 = r13.getUsername()
                com.instagram.common.typedurl.ImageUrl r0 = r13.Bhu()
                java.lang.String r1 = r0.getUrl()
                X.C14360o3.A07(r1)
                java.lang.String r0 = java.lang.Boolean.toString(r3)
                java.lang.String[] r0 = new java.lang.String[]{r12, r4, r2, r1, r0}
                r8.addRow(r0)
                int r5 = r5 + 1
                goto L53
            L95:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.users.impl.IgLoggedInUsersContentProvider.Impl.A0Q(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.AbstractC58329PtM
    public final void A07() {
    }
}
