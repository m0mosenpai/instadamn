package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

/* renamed from: X.Gsu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38308Gsu extends BaseAdapter {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C677733r A02;
    public final C38930HCd A03;
    public final Activity A04;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C37987GnX c37987GnX = this.A03.A04;
        if (c37987GnX != null) {
            return c37987GnX.A0B.BjZ();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A03.A04.A0B.BjY(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        switch (this.A03.A04.A0B.BjY(i).A01.intValue()) {
            case 0:
                return -1;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C41628IbJ c41628IbJ;
        TextView textView;
        Context context;
        ImageUrl A0t;
        String str;
        Object c41139IJe;
        View view2 = view;
        C38930HCd c38930HCd = this.A03;
        IF7 BjY = c38930HCd.A04.A0B.BjY(i);
        if (view == null) {
            int intValue = BjY.A01.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            view2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_sheet_see_all, viewGroup, false);
                            c41139IJe = new IF6(view2, c38930HCd);
                        } else {
                            throw AbstractC166987dD.A12("Unhandeled QuestionResponseCardViewModel type");
                        }
                    } else {
                        view2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_sheet_media, viewGroup, false);
                        c41139IJe = new C41599Ian(view2, this.A00, this.A01.getModuleName());
                    }
                } else {
                    view2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_sheet_music, viewGroup, false);
                    c41139IJe = new C42728IvO(view2, this.A00, this.A01, this.A02);
                }
            } else {
                view2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_sheet_text, viewGroup, false);
                c41139IJe = new C41139IJe(view2);
            }
            view2.setTag(c41139IJe);
        }
        Object tag = view2.getTag();
        int intValue2 = BjY.A01.intValue();
        if (intValue2 != 1) {
            if (intValue2 != 2) {
                if (intValue2 != 3) {
                    if (intValue2 == 4) {
                        tag.getClass();
                        ((IF6) tag).A01.A01.setText((CharSequence) null);
                    }
                } else {
                    C41599Ian c41599Ian = (C41599Ian) tag;
                    c41628IbJ = BjY.A00;
                    if (c41628IbJ != null) {
                        UserSession userSession = this.A00;
                        InterfaceC60442pS interfaceC60442pS = this.A01;
                        if (c41599Ian != null) {
                            QuestionMediaResponseModelIntf BRR = c41628IbJ.A00.BRR();
                            if (BRR != null) {
                                InterfaceC09390do interfaceC09390do = c41599Ian.A07;
                                AbstractC167007dF.A0L(interfaceC09390do).setVisibility(0);
                                InterfaceC09390do interfaceC09390do2 = c41599Ian.A06;
                                Context context2 = AbstractC167007dF.A0L(interfaceC09390do2).getContext();
                                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
                                Integer Ba2 = BRR.Ba2();
                                Ba2.getClass();
                                int intValue3 = Ba2.intValue();
                                Integer BZo = BRR.BZo();
                                BZo.getClass();
                                int intValue4 = BZo.intValue();
                                ViewGroup.LayoutParams layoutParams = AbstractC167007dF.A0L(interfaceC09390do).getLayoutParams();
                                layoutParams.width = (int) ((intValue3 / intValue4) * dimensionPixelSize);
                                layoutParams.height = dimensionPixelSize;
                                AbstractC167007dF.A0L(interfaceC09390do).setLayoutParams(layoutParams);
                                c41599Ian.A00 = BRR;
                                Integer BRq = BRR.BRq();
                                BRq.getClass();
                                if (BRq.intValue() == EnumC40111tc.A0Q.A00) {
                                    ImageInfo BGx = BRR.BGx();
                                    BGx.getClass();
                                    ExtendedImageUrl A00 = AbstractC41341IRm.A00(context2, BGx, intValue3, intValue4);
                                    if (A00 != null) {
                                        AbstractC167017dG.A1W(interfaceC09390do2, 0);
                                        ((IgProgressImageView) AbstractC166987dD.A17(interfaceC09390do2)).setUrl(A00, interfaceC60442pS);
                                    }
                                }
                                AbstractC167017dG.A1W(interfaceC09390do2, 8);
                            }
                            NXU nxu = (NXU) c41599Ian.A08.getValue();
                            NXU nxu2 = (NXU) c41599Ian.A0A.getValue();
                            NXU nxu3 = (NXU) c41599Ian.A05.getValue();
                            String moduleName = interfaceC60442pS.getModuleName();
                            QuestionMediaResponseModelIntf questionMediaResponseModelIntf = c41599Ian.A00;
                            if (questionMediaResponseModelIntf != null) {
                                I5I.A00(userSession, c38930HCd, c41628IbJ, nxu, nxu2, nxu3, AbstractC41341IRm.A01(questionMediaResponseModelIntf), moduleName);
                                InterfaceC09390do interfaceC09390do3 = c41599Ian.A0B;
                                ImageView imageView = ((IF5) interfaceC09390do3.getValue()).A00;
                                imageView.setVisibility(0);
                                ViewOnClickListenerC42034Ik3.A00(imageView, 35, c38930HCd, c41628IbJ);
                                textView = ((IF5) interfaceC09390do3.getValue()).A01;
                                context = ((IF5) interfaceC09390do3.getValue()).A01.getContext();
                            } else {
                                C14360o3.A0F("mediaResponseModel");
                                throw C00O.createAndThrow();
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                return view2;
            }
            tag.getClass();
            C42728IvO c42728IvO = (C42728IvO) tag;
            C41628IbJ c41628IbJ2 = BjY.A00;
            if (c41628IbJ2 != null) {
                UserSession userSession2 = this.A00;
                InterfaceC60442pS interfaceC60442pS2 = this.A01;
                MusicQuestionResponseModelIntf BVk = c41628IbJ2.A00.BVk();
                if (BVk != null) {
                    ImageView imageView2 = c42728IvO.A04;
                    boolean z = false;
                    imageView2.setVisibility(0);
                    View view3 = c42728IvO.A01;
                    view3.setVisibility(0);
                    c42728IvO.A03.setVisibility(0);
                    MusicAssetModel A01 = MusicAssetModel.A01(BVk.BVV(), false);
                    MusicConsumptionModel BVa = BVk.BVa();
                    C38064Gos c38064Gos = c42728IvO.A09;
                    String str2 = A01.A0I;
                    boolean z2 = A01.A0S;
                    C14360o3.A0B(c38064Gos, 0);
                    AbstractC38060Gon.A00(null, c38064Gos, str2, z2, false);
                    AbstractC38055Goi.A00(imageView2, A01.A02, null);
                    User BFU = BVa.BFU();
                    IgImageView igImageView = c42728IvO.A07;
                    if (BFU != null) {
                        A0t = BFU.Bhu();
                    } else {
                        A0t = AbstractC25225BEi.A0t(BVa.getPlaceholderProfilePicUrl());
                    }
                    igImageView.setUrl(A0t, interfaceC60442pS2);
                    TextView textView2 = c42728IvO.A05;
                    if (BFU != null) {
                        str = BFU.getUsername();
                    } else {
                        str = A01.A0D;
                    }
                    textView2.setText(str);
                    if (BFU != null) {
                        z = BFU.isVerified();
                    }
                    C85963sQ.A0A(textView2, c42728IvO.A00, z);
                    C3P9 A0s = AbstractC166987dD.A0s(view3);
                    A0s.A07 = true;
                    A0s.A04 = new HJA(4, c38930HCd, BFU);
                    A0s.A00();
                    C42739IvZ c42739IvZ = c42728IvO.A08;
                    C92564Cq c92564Cq = new C92564Cq(BVa);
                    c42739IvZ.A00 = A01;
                    c42739IvZ.A01 = c92564Cq;
                    C42739IvZ.A02(c42739IvZ, C42739IvZ.A03(c42739IvZ));
                }
                I5I.A00(userSession2, c38930HCd, c41628IbJ2, c42728IvO.A0C, c42728IvO.A0D, c42728IvO.A0B, null, interfaceC60442pS2.getModuleName());
                return view2;
            }
            throw AbstractC166997dE.A0g();
        }
        tag.getClass();
        C41139IJe c41139IJe2 = (C41139IJe) tag;
        c41628IbJ = BjY.A00;
        if (c41628IbJ != null) {
            UserSession userSession3 = this.A00;
            String moduleName2 = this.A01.getModuleName();
            TextView textView3 = c41139IJe2.A01;
            String A02 = c41628IbJ.A02();
            textView3.setVisibility(0);
            textView3.setText(A02);
            textView3.setOnLongClickListener(new ViewOnLongClickListenerC35705Fpf(2, textView3, c38930HCd));
            I5I.A00(userSession3, c38930HCd, c41628IbJ, c41139IJe2.A04, c41139IJe2.A05, c41139IJe2.A03, null, moduleName2);
            IF5 if5 = c41139IJe2.A02;
            ImageView imageView3 = if5.A00;
            imageView3.setVisibility(0);
            ViewOnClickListenerC42034Ik3.A00(imageView3, 35, c38930HCd, c41628IbJ);
            textView = if5.A01;
            context = textView.getContext();
        } else {
            throw AbstractC166997dE.A0g();
        }
        AbstractC31177DnL.A0r(context, textView, C41628IbJ.A00(c41628IbJ).getUsername(), 2131971231);
        return view2;
    }

    public C38308Gsu(Activity activity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, C38930HCd c38930HCd) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = c677733r;
        this.A03 = c38930HCd;
        this.A04 = activity;
    }
}
