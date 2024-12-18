package X;

import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mcf.MsysError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LUB implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC23621Ds A02;

    public LUB(String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        this.A02 = interfaceC23621Ds;
        this.A00 = j;
        this.A01 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object c09540e5;
        String str;
        C47594L0e c47594L0e = (C47594L0e) obj;
        C14360o3.A0B(c47594L0e, 0);
        MsysError msysError = c47594L0e.A00;
        Map map = c47594L0e.A01;
        if (msysError == null && map != null && !map.isEmpty()) {
            interfaceC23621Ds = this.A02;
            long j = this.A00;
            String str2 = this.A01;
            Object obj2 = map.get(LL8.A06);
            if (obj2 != null) {
                byte[] bArr = (byte[]) obj2;
                C14360o3.A0B(bArr, 0);
                String encodeToString = Base64.encodeToString(bArr, 2);
                C14360o3.A07(encodeToString);
                Object obj3 = map.get(LL8.A03);
                if (obj3 != null) {
                    byte[] bArr2 = (byte[]) obj3;
                    C14360o3.A0B(bArr2, 0);
                    String encodeToString2 = Base64.encodeToString(bArr2, 2);
                    C14360o3.A07(encodeToString2);
                    Object obj4 = map.get(LL8.A04);
                    if (obj4 != null) {
                        byte[] bArr3 = (byte[]) obj4;
                        C14360o3.A0B(bArr3, 0);
                        String encodeToString3 = Base64.encodeToString(bArr3, 2);
                        C14360o3.A07(encodeToString3);
                        Object obj5 = map.get(LL8.A02);
                        if (obj5 != null) {
                            String str3 = (String) obj5;
                            Object obj6 = map.get(LL8.A01);
                            if (obj6 != null) {
                                long A0N = AbstractC166987dD.A0N(obj6);
                                String str4 = (String) map.get(LL8.A05);
                                int A03 = (int) AbstractC13530mf.A03(str2);
                                String str5 = LL8.A08;
                                ArrayList arrayList = null;
                                if (map.get(str5) != null) {
                                    Object obj7 = map.get(str5);
                                    if (obj7 != null) {
                                        byte[] bArr4 = (byte[]) obj7;
                                        C14360o3.A0B(bArr4, 0);
                                        str = Base64.encodeToString(bArr4, 2);
                                        C14360o3.A07(str);
                                    } else {
                                        throw AbstractC166987dD.A12("Required value was null.");
                                    }
                                } else {
                                    str = null;
                                }
                                String str6 = LL8.A07;
                                if (map.get(str6) != null) {
                                    Object obj8 = map.get(str6);
                                    if (obj8 != null) {
                                        List list = (List) obj8;
                                        arrayList = AbstractC167017dG.A0q(list);
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            AbstractC166997dE.A1W(arrayList, (int) AbstractC166987dD.A0N(it.next()));
                                        }
                                    } else {
                                        throw AbstractC166987dD.A12("Required value was null.");
                                    }
                                }
                                c09540e5 = LLT.A02(null, Integer.valueOf(A03), str3, encodeToString, encodeToString2, encodeToString3, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str2)), str4, str, arrayList, A0N, j).toString();
                            } else {
                                throw AbstractC166987dD.A12("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A12("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A12("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A12("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A12("Required value was null.");
            }
        } else {
            interfaceC23621Ds = this.A02;
            c09540e5 = new C09540e5(new C50098M9m(msysError, c47594L0e.A02));
        }
        interfaceC23621Ds.resumeWith(c09540e5);
    }
}
