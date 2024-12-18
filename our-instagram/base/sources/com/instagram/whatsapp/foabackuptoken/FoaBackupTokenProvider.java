package com.instagram.whatsapp.foabackuptoken;

import X.AbstractC08760ce;
import X.AbstractC102054iQ;
import X.AbstractC12290kX;
import X.AbstractC34360FDc;
import X.AbstractC58329PtM;
import X.C03190Dc;
import X.C08600cO;
import X.C08610cP;
import X.C0CE;
import X.C0s6;
import X.C14360o3;
import X.C1U4;
import X.C1UM;
import X.C1ZT;
import X.C2ZO;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.secure.content.PublicContentDelegate;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class FoaBackupTokenProvider extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate {
        public final C08610cP A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0B(abstractC58329PtM, 1);
            C08600cO c08600cO = new C08600cO();
            c08600cO.A01 = new C03190Dc(Collections.singletonMap(AbstractC08760ce.A1h, C0CE.A06));
            this.A00 = c08600cO.A00();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            String asString;
            String str2;
            String str3;
            if (str == null || str.length() == 0) {
                return 0;
            }
            C2ZO.A01.A01();
            if (contentValues == null || (asString = contentValues.getAsString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) == null || asString.length() == 0) {
                return 0;
            }
            Context context = ((AbstractC102054iQ) this).A00.getContext();
            if (context != null) {
                if (AbstractC34360FDc.A00(context)) {
                    str2 = "wa_foa_backup_token_smb";
                } else {
                    str2 = "wa_foa_backup_token";
                }
                Context context2 = AbstractC12290kX.A00;
                C14360o3.A07(context2);
                C1ZT AR9 = C1U4.A00(context2).A00(str2).AR9();
                if (AbstractC34360FDc.A00(context)) {
                    str3 = "wa_foa_backup_token_smb";
                } else {
                    str3 = "wa_foa_backup_token";
                }
                AR9.A09(str3, asString);
                AR9.A0B();
            }
            return 1;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            String str3;
            String str4;
            String str5;
            if (str != null && str.length() != 0) {
                C2ZO.A01.A01();
                MatrixCursor matrixCursor = new MatrixCursor(strArr);
                if (strArr == null) {
                    strArr = new String[]{IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
                ArrayList arrayList = new ArrayList();
                C0s6 c0s6 = new C0s6(strArr);
                while (c0s6.hasNext()) {
                    if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(c0s6.next())) {
                        Context context = ((AbstractC102054iQ) this).A00.getContext();
                        if (context != null) {
                            if (AbstractC34360FDc.A00(context)) {
                                str4 = "wa_foa_backup_token_smb";
                            } else {
                                str4 = "wa_foa_backup_token";
                            }
                            Context context2 = AbstractC12290kX.A00;
                            C14360o3.A07(context2);
                            C1UM A00 = C1U4.A00(context2).A00(str4);
                            if (AbstractC34360FDc.A00(context)) {
                                str5 = "wa_foa_backup_token_smb";
                            } else {
                                str5 = "wa_foa_backup_token";
                            }
                            str3 = A00.getString(str5, null);
                            if (str3 != null) {
                                arrayList.add(str3);
                            }
                        }
                        str3 = "";
                        arrayList.add(str3);
                    } else {
                        throw new IllegalArgumentException("Only value is supported in the projection map");
                    }
                }
                matrixCursor.addRow(arrayList.toArray());
                return matrixCursor;
            }
            throw new UnsupportedOperationException("No selection found.");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.PublicContentDelegate, com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final boolean A0Z() {
            return this.A00.A03(((AbstractC102054iQ) this).A00.getContext(), null, null);
        }
    }
}
