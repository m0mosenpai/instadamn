package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.GJs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36793GJs implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C36793GJs(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C2JS requiredTreeField;
        C2JS optionalTreeField;
        Object obj2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        EnumC92794Ds enumC92794Ds;
        PendingRecipient pendingRecipient;
        User A02;
        if (this.A00 != 0) {
            C46h c46h = (C46h) obj;
            C14360o3.A0B(c46h, 0);
            C33096Ej0 c33096Ej0 = (C33096Ej0) this.A01;
            C05A c05a = c33096Ej0.A04;
            UserSession userSession = c33096Ej0.A01;
            String str = this.A02;
            if (str == null) {
                str = "";
            }
            int i = c33096Ej0.A00;
            if (c46h instanceof C4JL) {
                obj2 = AbstractC166987dD.A1E();
                Object A03 = c46h.A03();
                C14360o3.A07(A03);
                AbstractC1351869s abstractC1351869s = (AbstractC1351869s) A03;
                int length = str.length();
                int count = abstractC1351869s.mResultSet.getCount();
                if (length == 0) {
                    count = Math.min(count, i);
                }
                for (int i2 = 0; i2 < abstractC1351869s.mResultSet.getCount() && obj2.size() < count; i2++) {
                    if (!AbstractC46878KoL.A00(Integer.valueOf(abstractC1351869s.mResultSet.getInteger(i2, 3))).A02 && abstractC1351869s.mResultSet.getNullableLong(i2, 0) != null) {
                        String string = abstractC1351869s.mResultSet.getString(i2, 9);
                        if (string != null && string.length() != 0) {
                            strArr = AbstractC31173DnH.A1b(AbstractC167007dF.A0m(string, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0), 0);
                        } else {
                            strArr = new String[0];
                        }
                        String string2 = abstractC1351869s.mResultSet.getString(i2, 10);
                        if (string2 != null && string2.length() != 0) {
                            strArr2 = AbstractC31173DnH.A1b(AbstractC167007dF.A0m(string2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0), 0);
                        } else {
                            strArr2 = new String[0];
                        }
                        String string3 = abstractC1351869s.mResultSet.getString(i2, 13);
                        if (string3 != null && string3.length() != 0) {
                            strArr3 = AbstractC31173DnH.A1b(AbstractC167007dF.A0m(string3, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0), 0);
                        } else {
                            strArr3 = new String[0];
                        }
                        String string4 = abstractC1351869s.mResultSet.getString(i2, 14);
                        if (string4 != null && string4.length() != 0) {
                            strArr4 = AbstractC31173DnH.A1b(AbstractC167007dF.A0m(string4, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0), 0);
                        } else {
                            strArr4 = new String[0];
                        }
                        int length2 = strArr4.length;
                        int min = Math.min(length2, Math.min(strArr.length, length2));
                        ArrayList A1E = AbstractC166987dD.A1E();
                        C18A A00 = AnonymousClass189.A00(userSession);
                        for (int i3 = 0; i3 < min; i3++) {
                            if (i3 < strArr2.length && (A02 = A00.A02(strArr2[i3])) != null) {
                                pendingRecipient = new PendingRecipient(A02);
                            } else {
                                ImageUrl imageUrl = PendingRecipient.A0g;
                                pendingRecipient = new PendingRecipient(AbstractC25225BEi.A0t(strArr4[i3]), strArr[i3], strArr3[i3]);
                            }
                            A1E.add(pendingRecipient);
                        }
                        long A0t = AbstractC25232BEp.A0t(abstractC1351869s.mResultSet.getNullableLong(i2, 0));
                        Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(i2, 1);
                        if (Ko0.A00(abstractC1351869s.mResultSet.getInteger(i2, 2))) {
                            enumC92794Ds = EnumC92794Ds.A04;
                        } else {
                            enumC92794Ds = EnumC92794Ds.A07;
                        }
                        MsysThreadId msysThreadId = new MsysThreadId(enumC92794Ds, nullableLong, A0t);
                        String string5 = abstractC1351869s.mResultSet.getString(i2, 12);
                        String str2 = "";
                        if (string5 == null) {
                            string5 = "";
                        }
                        DirectShareTarget directShareTarget = new DirectShareTarget(msysThreadId, abstractC1351869s.mResultSet.getNullableBoolean(i2, 17), string5, A1E, AbstractC31177DnL.A03(abstractC1351869s.mResultSet.getNullableInteger(i2, 5)));
                        if (abstractC1351869s.mResultSet.getString(i2, 15) != null) {
                            String string6 = abstractC1351869s.mResultSet.getString(i2, 15);
                            if (string6 != null) {
                                str2 = string6;
                            }
                            directShareTarget.A02 = new ExtendedImageUrl(str2, -1, -1);
                        }
                        obj2.add(directShareTarget);
                    }
                }
            } else {
                obj2 = C16930sl.A00;
            }
            c05a.Egh(obj2);
            AbstractC166997dE.A1Y(c33096Ej0.A03, true);
            return;
        }
        C2JS c2js = (C2JS) obj;
        if (c2js != null && (requiredTreeField = c2js.getRequiredTreeField(0, AbstractC58317Pt9.A00(1047), C60416Qz4.class, -747799946)) != null && (optionalTreeField = requiredTreeField.getOptionalTreeField(0, AbstractC58317Pt9.A00(969), C60415Qz3.class, -1337962279)) != null && optionalTreeField.getRequiredStringField(1, "share_id") != null) {
            C70805WhL c70805WhL = ((DirectShareSheetFragmentViewModel) this.A01).A0U;
            String str3 = this.A02;
            String requiredStringField = optionalTreeField.getRequiredStringField(1, "share_id");
            C14360o3.A07(requiredStringField);
            ((C200448tn) c70805WhL.A00).A00.put(str3, requiredStringField);
        }
    }
}
