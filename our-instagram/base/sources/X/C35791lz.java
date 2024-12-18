package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.1lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35791lz implements InterfaceC29301b7 {
    public static final C0KV A02 = C35801m0.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHR(this, 16));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35771lx c35771lx = (C35771lx) c1ow;
        C14360o3.A0B(c35771lx, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List list = c35771lx.A00;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    break;
                }
                String str2 = (String) obj;
                C50092Rx A0A = ((C2DU) ((C2DS) this.A01.getValue())).A0C.A0A(str2);
                if (A0A != null && (str = A0A.A06) != null) {
                    arrayList.add(new C26062Bfp(i, 4, str2, str));
                }
                i = i2;
            }
            int size = arrayList.size();
            List list2 = c35771lx.A00;
            if (list2 != null) {
                if (size == list2.size()) {
                    C40701ud A01 = AbstractC40691uc.A01(this.A00);
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C26062Bfp c26062Bfp = (C26062Bfp) it.next();
                        ?? graphQlCallInput = new GraphQlCallInput();
                        graphQlCallInput.A09(c26062Bfp.A01, "folder_id");
                        graphQlCallInput.A09(c26062Bfp.A02, DatePickerDialogModule.ARG_MODE);
                        graphQlCallInput.A07(Integer.valueOf(c26062Bfp.A00), "sequence_number");
                        arrayList2.add(graphQlCallInput);
                    }
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    Be9 be9 = new Be9();
                    be9.A05("sequence_objects", arrayList2);
                    c2jm.A00(be9, "data");
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    A01.ATV(new C35798Fra(interfaceC37261GbE), new C35829Fs5(interfaceC37261GbE), new PandoGraphQLRequest(AbstractC40511uK.A00(), "ReorderCustomFoldersMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59394Qdr.class, true, null, 96, null, "reorder_ig_business_custom_folders", new ArrayList()));
                    return;
                }
                interfaceC37261GbE.DUq(new C114675Fx(null, EnumC46247KdO.A0C, "8", null, "http", null, "Folder sequence mapping to server_mode mismatch", null, new LinkedHashMap(), false, false, false, false, false, false), null);
                return;
            }
        }
        C14360o3.A0F("folderSequence");
        throw C00O.createAndThrow();
    }

    public C35791lz(UserSession userSession) {
        this.A00 = userSession;
    }
}
