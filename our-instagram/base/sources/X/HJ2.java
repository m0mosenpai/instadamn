package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HJ2 extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public HJ2(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            super.onFail(exc);
            return;
        }
        C6FQ c6fq = (C6FQ) this.A02;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
        C6FX c6fx = new C6FX();
        c6fx.A01(6);
        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImageInfoImpl imageInfoImpl;
        SpritesheetInfoImpl spritesheetInfoImpl;
        Object questionResponseModel;
        File file = (File) obj;
        if (this.A00 != 0) {
            try {
                C41628IbJ c41628IbJ = (C41628IbJ) this.A03;
                QuestionMediaResponseModelIntf questionMediaResponseModelIntf = (QuestionMediaResponseModelIntf) this.A02;
                Boolean BB7 = questionMediaResponseModelIntf.BB7();
                String id = questionMediaResponseModelIntf.getId();
                ImageInfo BGx = questionMediaResponseModelIntf.BGx();
                Integer CSN = questionMediaResponseModelIntf.CSN();
                Integer BRq = questionMediaResponseModelIntf.BRq();
                Integer BZo = questionMediaResponseModelIntf.BZo();
                Integer Ba2 = questionMediaResponseModelIntf.Ba2();
                SpritesheetInfo C8E = questionMediaResponseModelIntf.C8E();
                String videoCodec = questionMediaResponseModelIntf.getVideoCodec();
                String videoDashManifest = questionMediaResponseModelIntf.getVideoDashManifest();
                questionMediaResponseModelIntf.CFK();
                List CFe = questionMediaResponseModelIntf.CFe();
                String canonicalPath = file.getCanonicalPath();
                ArrayList arrayList = null;
                if (BGx != null) {
                    imageInfoImpl = BGx.F5B();
                } else {
                    imageInfoImpl = null;
                }
                if (C8E != null) {
                    spritesheetInfoImpl = C8E.F5D();
                } else {
                    spritesheetInfoImpl = null;
                }
                if (CFe != null) {
                    arrayList = AbstractC167017dG.A0q(CFe);
                    Iterator it = CFe.iterator();
                    while (it.hasNext()) {
                        AbstractC37303Gc4.A1Y(arrayList, it);
                    }
                }
                QuestionMediaResponseModel questionMediaResponseModel = new QuestionMediaResponseModel(imageInfoImpl, spritesheetInfoImpl, BB7, CSN, BRq, BZo, Ba2, id, videoCodec, videoDashManifest, canonicalPath, arrayList);
                QuestionResponseModelIntf questionResponseModelIntf = c41628IbJ.A00;
                C14360o3.A0B(questionResponseModelIntf, 1);
                boolean BCd = questionResponseModelIntf.BCd();
                String id2 = questionResponseModelIntf.getId();
                questionResponseModelIntf.BRR();
                MusicQuestionResponseModelIntf BVk = questionResponseModelIntf.BVk();
                String Bog = questionResponseModelIntf.Bog();
                QuestionResponseType Bol = questionResponseModelIntf.Bol();
                Boolean Bs7 = questionResponseModelIntf.Bs7();
                Boolean Bv1 = questionResponseModelIntf.Bv1();
                int CBC = questionResponseModelIntf.CBC();
                User CDj = questionResponseModelIntf.CDj();
                TreeUpdaterJNI treeUpdaterJNI = null;
                int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
                if (questionResponseModelIntf instanceof ImmutablePandoQuestionResponseModel) {
                    C09530e4 A1L = AbstractC166987dD.A1L("has_shared_response", Boolean.valueOf(BCd));
                    C09530e4 A1L2 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, id2);
                    C09530e4 A1L3 = AbstractC166987dD.A1L("media_response", questionMediaResponseModel.F7o());
                    if (BVk != null) {
                        treeUpdaterJNI = BVk.F7o();
                    }
                    C09530e4 A1L4 = AbstractC166987dD.A1L("music_response", treeUpdaterJNI);
                    C09530e4 A1L5 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, Bog);
                    C14360o3.A0B(Bol, 0);
                    questionResponseModel = AbstractC37303Gc4.A06(questionResponseModelIntf, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L("response_type", Bol.A00), AbstractC166987dD.A1L("seen", Bs7), AbstractC166987dD.A1L("should_enable_reply_creation", Bv1), AbstractC166987dD.A1L("ts", Integer.valueOf(CBC)), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07())});
                } else {
                    MusicQuestionResponseModel musicQuestionResponseModel = null;
                    C1DY A0C = AbstractC37302Gc3.A0C(A00);
                    if (BVk != null) {
                        musicQuestionResponseModel = BVk.F6z(A0C);
                    }
                    questionResponseModel = new QuestionResponseModel(musicQuestionResponseModel, Bol, questionMediaResponseModel, CDj, Bs7, Bv1, id2, Bog, CBC, BCd);
                }
                c41628IbJ.A00 = (QuestionResponseModelIntf) questionResponseModel;
            } catch (IOException e) {
                C0w9.A06("QuestionResponseBottomSheetViewBinder", "Unable to get canonical path: ", e);
            }
            ((C38930HCd) this.A01).A04.A03((C41628IbJ) this.A03);
            return;
        }
        C14360o3.A0B(file, 0);
        AbstractC50633MWu.A09((Context) this.A01, file);
        C6FQ c6fq = (C6FQ) this.A02;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
        C6FX c6fx = new C6FX();
        c6fx.A03(0, 0);
        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
    }
}
