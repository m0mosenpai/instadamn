package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Chl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28493Chl {
    public static final C28493Chl A00 = new Object();
    public static final InterfaceC09390do A01;
    public static final InterfaceC09390do A02;

    public static final V2U A02(UserSession userSession, C38321qM c38321qM) {
        MusicInfo BVc;
        TrackData BVV;
        String str;
        boolean z;
        MusicConsumptionModel BVa;
        Boolean Cer;
        MusicConsumptionModel BVa2;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null && (BVc = A0u.BVc()) != null && (BVV = BVc.BVV()) != null) {
            String audioClusterId = BVV.getAudioClusterId();
            if (audioClusterId == null) {
                audioClusterId = "";
            }
            String title = BVV.getTitle();
            if (title == null) {
                title = "";
            }
            String A05 = AbstractC117245Sj.A05(A0u);
            MusicInfo BVc2 = A0u.BVc();
            if (BVc2 == null || (BVa2 = BVc2.BVa()) == null || (str = BVa2.getFormattedClipsMediaCount()) == null) {
                str = "";
            }
            ImageUrl AsE = BVV.AsE();
            if (AsE == null) {
                AsE = AbstractC25225BEi.A0t("");
            }
            boolean A08 = AbstractC117245Sj.A08(A0u);
            String id = c38321qM.getId();
            if (id != null) {
                User A2E = c38321qM.A2E(userSession);
                C14360o3.A0A(A2E);
                String id2 = A2E.getId();
                boolean isExplicit = BVV.isExplicit();
                MusicInfo BVc3 = A0u.BVc();
                if (BVc3 != null && (BVa = BVc3.BVa()) != null && (Cer = BVa.Cer()) != null) {
                    z = Cer.booleanValue();
                } else {
                    z = false;
                }
                MusicInfo BVc4 = A0u.BVc();
                C14360o3.A0A(BVc4);
                return new V2U(AsE, c38321qM, BVc4.BVa(), title, A05, str, audioClusterId, id, id2, A08, isExplicit, z);
            }
            throw AbstractC166997dE.A0g();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.VJ2, java.lang.Object] */
    public static final V2V A03(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf BZw;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null && (BZw = A0u.BZw()) != null) {
            C117235Si c117235Si = new C117235Si(BZw);
            String str = c117235Si.A09;
            String str2 = c117235Si.A0D;
            String A05 = AbstractC117245Sj.A05(A0u);
            String str3 = c117235Si.A0B;
            if (str3 == null) {
                str3 = "";
            }
            ImageUrl Bhu = c117235Si.A05.Bhu();
            boolean A08 = AbstractC117245Sj.A08(A0u);
            String id = c38321qM.getId();
            if (id != null) {
                User A2E = c38321qM.A2E(userSession);
                C14360o3.A0A(A2E);
                String id2 = A2E.getId();
                boolean z = c117235Si.A0J;
                boolean z2 = c117235Si.A0M;
                OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf = c117235Si.A02;
                C14360o3.A0B(originalSoundConsumptionInfoIntf, 0);
                ?? obj = new Object();
                obj.A00 = originalSoundConsumptionInfoIntf;
                return new V2V(Bhu, c38321qM, obj, str2, A05, str3, str, id, id2, A08, z, z2, false);
            }
            throw AbstractC166997dE.A0g();
        }
        return null;
    }

    public static final ArrayList A05(C38321qM c38321qM) {
        ArrayList A12 = AbstractC166997dE.A12(c38321qM, 0);
        ArrayList A3M = c38321qM.A3M();
        if (A3M != null) {
            Iterator it = A3M.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                String id = peopleTag.getId();
                C14360o3.A07(id);
                PeopleTag.UserInfo userInfo = peopleTag.A00;
                String str = userInfo.A04;
                if (str == null) {
                    str = "";
                }
                String str2 = userInfo.A02;
                if (str2 == null) {
                    str2 = "";
                }
                ImageUrl imageUrl = userInfo.A01;
                C14360o3.A07(imageUrl);
                A12.add(new C26916BuJ(imageUrl, id, str, str2));
            }
        }
        return A12;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A06(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C38321qM r10, boolean r11) {
        /*
            r7 = this;
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            float r3 = A00(r8)
            java.util.ArrayList r0 = A05(r10)
            boolean r0 = X.AbstractC25226BEj.A1b(r0)
            if (r0 == 0) goto Lb8
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            float r6 = r1.getDimension(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            float r0 = r1.getDimension(r0)
            float r6 = r6 + r0
        L29:
            if (r11 == 0) goto Lb5
            android.content.res.Resources r2 = r8.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            float r2 = r2.getDimension(r0)
            android.content.res.Resources r0 = r8.getResources()
            float r5 = r0.getDimension(r1)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165567(0x7f07017f, float:1.7945355E38)
            float r0 = r1.getDimension(r0)
            float r5 = r5 + r0
            float r5 = r5 + r2
            X.3x9 r0 = X.AbstractC25226BEj.A0u(r10)
            if (r0 == 0) goto Lb6
            X.3xD r0 = X.AbstractC117245Sj.A01(r0)
            if (r0 == 0) goto Lb6
            boolean r0 = r0.Ceq()
            if (r0 == 0) goto Lb6
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            float r4 = r1.getDimension(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            float r0 = r1.getDimension(r0)
            float r4 = r4 + r0
        L77:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165316(0x7f070084, float:1.7944846E38)
            float r2 = r1.getDimension(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 + r0
            java.util.List r0 = r7.A07(r8, r9, r10)
            int r0 = r0.size()
            float r0 = (float) r0
            float r0 = r0 * r2
            float r3 = r3 + r0
            float r3 = r3 + r6
            float r3 = r3 + r5
            float r3 = r3 + r4
            int r0 = X.AbstractC13880nE.A09(r8)
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r1, r3)
            int r0 = X.AbstractC13880nE.A09(r8)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r11 == 0) goto Lb4
            r0 = 1051595899(0x3eae147b, float:0.34)
            float r1 = r1 + r0
        Lb4:
            return r1
        Lb5:
            r5 = 0
        Lb6:
            r4 = 0
            goto L77
        Lb8:
            r6 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28493Chl.A06(android.content.Context, com.instagram.common.session.UserSession, X.1qM, boolean):float");
    }

    public final List A07(Context context, UserSession userSession, C38321qM c38321qM) {
        C26920BuN c26920BuN;
        C26921BuO c26921BuO;
        C26919BuM c26919BuM;
        C26926BuT c26926BuT;
        C26929BuW c26929BuW;
        AbstractC29162CtT abstractC29162CtT;
        InterfaceC110214xq A1R;
        String str;
        ImageUrl A0t;
        ImageInfo BGx;
        InterfaceC43580JMo A0t2;
        String attributionIconUrl;
        InterfaceC43580JMo A0t3;
        String attributionTitle;
        InterfaceC43580JMo A0t4;
        String attributionSubtitle;
        InterfaceC43580JMo A0t5;
        String attributionTitle2;
        InterfaceC43580JMo A0t6;
        String attributionTitle3;
        InterfaceC43580JMo A0t7;
        String iconicHorizonWorldName;
        InterfaceC43580JMo A0t8;
        WorldLocationPagesInfo CHs;
        String coverPhoto;
        String str2;
        List<EnumC25546BRi> A07;
        List<EffectPreviewIntf> B0S;
        V2V v2v;
        C26924BuR c26924BuR;
        InterfaceC107114sH B7j;
        String Aya;
        String A0f;
        InterfaceC84033on AZi;
        boolean A1R2 = AbstractC167007dF.A1R(0, userSession, c38321qM);
        c38321qM.BqJ();
        boolean CdW = c38321qM.CdW();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (CdW) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (AZi = A0u.AZi()) != null) {
                String id = c38321qM.getId();
                if (id != null) {
                    String A0q = AbstractC166997dE.A0q(context.getResources(), 2131969269);
                    String additionalAudioUsername = AZi.getAdditionalAudioUsername();
                    if (additionalAudioUsername == null) {
                        additionalAudioUsername = "";
                    }
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    if (A14 != null) {
                        ImageUrl Bhu = A14.Bhu();
                        String id2 = c38321qM.getId();
                        if (id2 != null) {
                            User A2E = c38321qM.A2E(userSession);
                            if (A2E != null) {
                                v2v = new V2V(Bhu, c38321qM, null, A0q, additionalAudioUsername, "", id, id2, A2E.getId(), false, false, false, A1R2);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                v2v = null;
            }
            A1E.add(v2v);
            AppstoreMetadataDict AcT = c38321qM.A0C.AcT();
            if (AcT != null) {
                boolean A1W = AbstractC167007dF.A1W(AcT.BY0());
                Drawable drawable = context.getDrawable(R.drawable.instagram_icons_exceptions_google_play_pano_outline_32);
                if (A1W) {
                    A0f = CJG.A00(context, AcT);
                } else {
                    A0f = AbstractC167007dF.A0f(context, AcT.BIT(), 2131952978);
                    C14360o3.A07(A0f);
                }
                String A0p = AbstractC166997dE.A0p(C02G.A01(context), 2131971553);
                String id3 = c38321qM.getId();
                if (id3 != null) {
                    c26924BuR = new C26924BuR(drawable, id3, A0f, A0p, A1W);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                c26924BuR = null;
            }
            A1E.add(c26924BuR);
            A01.getValue();
            boolean A012 = C25380BKx.A01(userSession, c38321qM);
            InterfaceC87803vo BUx = c38321qM.A0C.BUx();
            abstractC29162CtT = null;
            if (BUx != null && (B7j = BUx.B7j()) != null && (Aya = B7j.Aya()) != null && A012) {
                User A2E2 = c38321qM.A2E(userSession);
                if (A2E2 != null) {
                    String id4 = A2E2.getId();
                    String id5 = c38321qM.getId();
                    User A142 = AbstractC25226BEj.A14(c38321qM);
                    if (A142 != null) {
                        abstractC29162CtT = new C26917BuK(A142.Bhu(), id4, Aya, id5);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        } else {
            A1E.add(A04(c38321qM));
            A1E.add(A03(userSession, c38321qM));
            A1E.add(A02(userSession, c38321qM));
            String BW0 = c38321qM.A0C.BW0();
            if (BW0 == null) {
                BW0 = "";
            }
            if (AbstractC65857TvJ.A02(userSession, c38321qM)) {
                c26920BuN = new C26920BuN(c38321qM, BW0, AbstractC65857TvJ.A00(BW0));
            } else {
                c26920BuN = null;
            }
            A1E.add(c26920BuN);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            CreativeConfigIntf Asm = c38321qM.A0C.Asm();
            if (Asm != null && (B0S = Asm.B0S()) != null) {
                for (EffectPreviewIntf effectPreviewIntf : B0S) {
                    String id6 = effectPreviewIntf.getId();
                    String name = effectPreviewIntf.getName();
                    String A03 = AbstractC41732Ie4.A03(effectPreviewIntf);
                    String formattedClipsMediaCount = effectPreviewIntf.getFormattedClipsMediaCount();
                    if (formattedClipsMediaCount == null) {
                        formattedClipsMediaCount = "";
                    }
                    ImageUrl A002 = AbstractC41732Ie4.A00(effectPreviewIntf);
                    if (A002 != null) {
                        A1E2.add(new C26930BuX(A002, effectPreviewIntf, c38321qM, id6, name, A03, formattedClipsMediaCount, "SAVED".equals(effectPreviewIntf.getSaveStatus())));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                Iterator it = A1E2.iterator();
                while (it.hasNext()) {
                    A1E.add(it.next());
                }
            }
            CreativeConfigIntf Asm2 = c38321qM.A0C.Asm();
            C26927BuU c26927BuU = null;
            if (Asm2 != null && (A07 = AbstractC121575f6.A07(context, Asm2)) != null) {
                for (EnumC25546BRi enumC25546BRi : A07) {
                    if (enumC25546BRi == EnumC25546BRi.A07) {
                        c26921BuO = new C26921BuO(enumC25546BRi);
                        break;
                    }
                }
            }
            c26921BuO = null;
            A1E.add(c26921BuO);
            Venue A27 = c38321qM.A27();
            if (A27 != null) {
                String A05 = A27.A05();
                C14360o3.A07(A05);
                String name2 = A27.A00.getName();
                if (name2 == null) {
                    name2 = "";
                }
                String A022 = WFD.A02(context, userSession, A27, "CLIPS_RECIPE_SHEET");
                C14360o3.A07(A022);
                int A04 = AbstractC25235BEs.A04(context);
                if (A27.A00() != null && A27.A01() != null) {
                    StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("clips_recipe_sheet_location_row");
                    Double A003 = A27.A00();
                    if (A003 != null) {
                        double doubleValue = A003.doubleValue();
                        Double A013 = A27.A01();
                        if (A013 != null) {
                            staticMapView$StaticMapOptions.A01(doubleValue, A013.doubleValue());
                            staticMapView$StaticMapOptions.A03(11);
                            str2 = IgStaticMapView.A00(context.getResources(), staticMapView$StaticMapOptions, C2TD.A03, A04, A04).toString();
                            C14360o3.A0A(str2);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    str2 = "";
                }
                c26919BuM = new C26919BuM(AbstractC25225BEi.A0t(str2), c38321qM, A05, name2, A022);
            } else {
                c26919BuM = null;
            }
            A1E.add(c26919BuM);
            C26923BuQ c26923BuQ = null;
            if (c38321qM.A6k(userSession) && (A0t7 = AbstractC25226BEj.A0t(c38321qM)) != null && (iconicHorizonWorldName = A0t7.getIconicHorizonWorldName()) != null && (A0t8 = AbstractC25226BEj.A0t(c38321qM)) != null && (CHs = A0t8.CHs()) != null && (coverPhoto = CHs.getCoverPhoto()) != null) {
                String id7 = c38321qM.getId();
                if (id7 != null) {
                    c26923BuQ = new C26923BuQ(AbstractC25225BEi.A0t(coverPhoto), c38321qM, id7, iconicHorizonWorldName);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A1E.add(c26923BuQ);
            if (c38321qM.A6g(userSession) && (A0t6 = AbstractC25226BEj.A0t(c38321qM)) != null && (attributionTitle3 = A0t6.getAttributionTitle()) != null) {
                String id8 = c38321qM.getId();
                if (id8 != null) {
                    c26926BuT = new C26926BuT(context.getDrawable(R.drawable.horizon_worlds_foa_horizonlogo), c38321qM, id8, attributionTitle3);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                c26926BuT = null;
            }
            A1E.add(c26926BuT);
            if (c38321qM.A6j(userSession) && (A0t5 = AbstractC25226BEj.A0t(c38321qM)) != null && (attributionTitle2 = A0t5.getAttributionTitle()) != null) {
                String id9 = c38321qM.getId();
                if (id9 != null) {
                    c26927BuU = new C26927BuU(context.getDrawable(R.drawable.instagram_meta_logo_pano_outline_24), c38321qM, id9, attributionTitle2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A1E.add(c26927BuU);
            C26922BuP c26922BuP = null;
            if (c38321qM.A6U() && (A0t2 = AbstractC25226BEj.A0t(c38321qM)) != null && (attributionIconUrl = A0t2.getAttributionIconUrl()) != null && (A0t3 = AbstractC25226BEj.A0t(c38321qM)) != null && (attributionTitle = A0t3.getAttributionTitle()) != null && (A0t4 = AbstractC25226BEj.A0t(c38321qM)) != null && (attributionSubtitle = A0t4.getAttributionSubtitle()) != null) {
                String id10 = c38321qM.getId();
                if (id10 != null) {
                    c26922BuP = new C26922BuP(AbstractC25225BEi.A0t(attributionIconUrl), c38321qM, id10, attributionTitle, attributionSubtitle);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A1E.add(c26922BuP);
            A1E.add(A01(context, userSession, c38321qM));
            if (AbstractC37668Gi1.A01(userSession, c38321qM)) {
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it2 = HE0.A08.A00(context, userSession, c38321qM, false).iterator();
                while (it2.hasNext()) {
                    A1E3.add(it2.next());
                }
                Iterator it3 = A1E3.iterator();
                while (it3.hasNext()) {
                    A1E.add(it3.next());
                }
            }
            if (c38321qM.A6J() && C18U.A06(C06090Tz.A05, userSession, 36317199778386802L) && (A1R = c38321qM.A1R()) != null) {
                String valueOf = String.valueOf(A1R.getTemplateClipsMediaId());
                String A0p2 = AbstractC166997dE.A0p(context, 2131975267);
                InterfaceC110104xf AdG = A1R.AdG();
                if (AdG == null || (str = AdG.getOwnerUsername()) == null) {
                    str = "";
                }
                InterfaceC110104xf AdG2 = A1R.AdG();
                if (AdG2 == null || (BGx = AdG2.BGx()) == null || (A0t = AbstractC40161tk.A02(BGx)) == null) {
                    A0t = AbstractC25225BEi.A0t("");
                }
                c26929BuW = new C26929BuW(A0t, c38321qM, valueOf, A0p2, str, c38321qM.CcN());
            } else {
                c26929BuW = null;
            }
            A1E.add(c26929BuW);
            if (c38321qM.A0C.BGH() != null && c38321qM.A0C.BGH() != null && C18U.A06(C06090Tz.A05, userSession, 36317332922963033L)) {
                String A0p3 = AbstractC166997dE.A0p(C02G.A01(context), 2131969672);
                String id11 = c38321qM.getId();
                if (id11 != null) {
                    abstractC29162CtT = new C26925BuS(context.getDrawable(R.drawable.instagram_product_details_add_pano_outline_24), c38321qM, id11, A0p3);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                abstractC29162CtT = null;
            }
        }
        A1E.add(abstractC29162CtT);
        return AbstractC001800i.A0X(A1E);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Chl] */
    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A02 = AbstractC09440dt.A00(enumC09460dv, DGS.A00);
        A01 = AbstractC09440dt.A00(enumC09460dv, DGR.A00);
    }

    public static final C26918BuL A01(Context context, UserSession userSession, C38321qM c38321qM) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36324411028025500L)) {
            return null;
        }
        String A0p = AbstractC166997dE.A0p(C02G.A01(context), 2131971558);
        String id = c38321qM.getId();
        if (id != null) {
            return new C26918BuL(c38321qM, id, A0p);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final float A00(Context context) {
        float A04;
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        float dimension2 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        float dimension3 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        float dimension4 = resources.getDimension(R.dimen.ads_disclosure_footer_top_divider_height);
        Drawable drawable = context.getDrawable(R.drawable.instagram_camera_outline_44);
        C14360o3.A0C(drawable, MSV.A00(523));
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            A04 = intrinsicHeight;
        } else {
            A04 = AbstractC13880nE.A04(context, 44);
        }
        return dimension + dimension2 + dimension3 + dimension4 + A04;
    }

    public static final C26928BuV A04(C38321qM c38321qM) {
        C4GI BZr;
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P != null && (BZr = A1P.BZr()) != null) {
            String pk = BZr.getPk();
            String username = BZr.CDj().getUsername();
            String B8y = BZr.CDj().B8y();
            String B8F = BZr.B8F();
            if (B8F == null) {
                B8F = "";
            }
            return new C26928BuV(BZr.CDj().Bhu(), pk, username, B8y, B8F, BZr.CDj().getId(), AbstractC167007dF.A1X(c38321qM.BqJ(), EnumC77213d7.A04));
        }
        return null;
    }
}
