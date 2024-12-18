package com.instagram.barcelona.feed.crossapp.contentprovider;

import X.AbstractC08590cN;
import X.AbstractC08760ce;
import X.AbstractC08820cl;
import X.AbstractC102054iQ;
import X.AbstractC111324zv;
import X.AbstractC18680vv;
import X.AbstractC53797Nqn;
import X.AbstractC58329PtM;
import X.C023409i;
import X.C08600cO;
import X.C102094ic;
import X.C14360o3;
import X.C2ZO;
import X.C41575IaO;
import X.N3Q;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ThreadsContentProvider extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate {
        public final C102094ic A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
            this.A00 = new C102094ic(this);
        }

        private final void A00(Context context) {
            List singletonList = Collections.singletonList(AbstractC08760ce.A0n);
            C14360o3.A07(singletonList);
            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(singletonList));
            C08600cO c08600cO = new C08600cO();
            c08600cO.A01 = AbstractC08590cN.A02(unmodifiableSet);
            c08600cO.A00().A02(context, null, null);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            String str2;
            Context context = ((AbstractC102054iQ) this).A00.getContext();
            try {
                if (context != null) {
                    A00(context);
                    C2ZO.A01.A01();
                    AbstractC18680vv A05 = C023409i.A0A.A05(this);
                    if (strArr != null && 0 < strArr.length && (str2 = strArr[0]) != null && (A05 instanceof UserSession) && str2.equals(((UserSession) A05).userId)) {
                        synchronized (C41575IaO.A03) {
                            C41575IaO.A02 = false;
                            C41575IaO.A01 = null;
                        }
                        return 1;
                    }
                    return 0;
                }
                throw new SecurityException("Unable to evaluate component access controls, 'context' is null.");
            } catch (SecurityException e) {
                throw new SecurityException(AbstractC111324zv.A00(82), e);
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            boolean z;
            N3Q n3q;
            boolean z2;
            String[] strArr3;
            String str3;
            C41575IaO c41575IaO = C41575IaO.A03;
            synchronized (c41575IaO) {
                z = C41575IaO.A02;
            }
            if (z) {
                Context context = ((AbstractC102054iQ) this).A00.getContext();
                try {
                    if (context != null) {
                        A00(context);
                        C2ZO.A01.A01();
                        AbstractC18680vv A05 = C023409i.A0A.A05(this);
                        boolean z3 = false;
                        if (strArr2 != null && 0 < strArr2.length && (str3 = strArr2[0]) != null && (A05 instanceof UserSession) && str3.equals(((UserSession) A05).userId)) {
                            z3 = true;
                        }
                        if (z3) {
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"COL_FEED_RESPONSE_STATE", "COL_FEED_RESPONSE", "COL_FEED_RESPONSE_PHRASE", "COL_FEED_RESPONSE_HEADERS"});
                            synchronized (c41575IaO) {
                                n3q = C41575IaO.A01;
                            }
                            if (n3q != null) {
                                strArr3 = new String[]{"COL_FEED_RESPONSE_READY", n3q.A01, n3q.A02, AbstractC53797Nqn.A00(n3q.A03)};
                            } else {
                                synchronized (c41575IaO) {
                                    z2 = C41575IaO.A02;
                                }
                                if (z2) {
                                    strArr3 = new String[]{"COL_FEED_RESPONSE_IN_PROGRESS", null, null, null};
                                }
                                return matrixCursor;
                            }
                            matrixCursor.addRow(strArr3);
                            return matrixCursor;
                        }
                    } else {
                        throw new SecurityException("Unable to evaluate component access controls, 'context' is null.");
                    }
                } catch (SecurityException e) {
                    throw new SecurityException(AbstractC111324zv.A00(82), e);
                }
            }
            return null;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final void A0U() {
            C41575IaO c41575IaO = C41575IaO.A03;
            C102094ic c102094ic = this.A00;
            synchronized (c41575IaO) {
                C41575IaO.A00 = c102094ic;
                if (C41575IaO.A01 != null && c102094ic != null) {
                    ((AbstractC102054iQ) c102094ic.A00).A00.getContext().getContentResolver().notifyChange(AbstractC08820cl.A03(AbstractC111324zv.A00(2182)), null);
                }
            }
        }
    }
}
