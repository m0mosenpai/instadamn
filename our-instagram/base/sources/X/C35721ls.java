package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.1ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35721ls implements InterfaceC29301b7 {
    public static final C0KV A02 = C35731lt.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new MHR(this, 15));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35691lp c35691lp = (C35691lp) c1ow;
        C14360o3.A0B(c35691lp, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C46922Dg c46922Dg = ((C2DU) ((C2DS) this.A01.getValue())).A0C;
        String str2 = c35691lp.A00;
        if (str2 != null) {
            C50092Rx A0A = c46922Dg.A0A(str2);
            if (A0A != null) {
                UserSession userSession = this.A00;
                String str3 = c35691lp.A00;
                if (str3 != null) {
                    String str4 = c35691lp.A01;
                    if (str4 != null) {
                        String str5 = A0A.A06;
                        C14360o3.A0B(str5, 4);
                        C40701ud A01 = AbstractC40691uc.A01(userSession);
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        C0CA A022 = GraphQlCallInput.A02.A02();
                        C0CA.A00(A022, str3, "folder_id");
                        C0CA.A00(A022, str4, "folder_name");
                        C0CA.A00(A022, str5, DatePickerDialogModule.ARG_MODE);
                        c2jm.A00.A02().A0E(A022, "data");
                        C2JQ c2jq = PandoGraphQLRequest.Companion;
                        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "RenameCustomFolderMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59392Qdp.class, true, null, 96, null, "rename_ig_business_custom_folder", new ArrayList());
                        A01.ATV(new C35797FrZ(interfaceC37261GbE), new C35828Fs4(interfaceC37261GbE), pandoGraphQLRequest);
                        return;
                    }
                    str = "folderName";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            } else {
                interfaceC37261GbE.DUq(new C114675Fx(null, EnumC46247KdO.A0C, "8", null, "http", null, "Folder name update failed because folder from cache is null", null, new LinkedHashMap(), false, false, false, false, false, false), null);
                return;
            }
        }
        str = "folderId";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35721ls(UserSession userSession) {
        this.A00 = userSession;
    }
}
