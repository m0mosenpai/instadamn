package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MV7 implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;

    public MV7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C05A c05a;
        Object c51758Mth;
        C2JS A0k;
        C2JS A03;
        C2JS A032;
        C2JS A033;
        ImmutableList A06;
        Object value;
        List list;
        C2JS A034;
        ImmutableList optionalCompactedTreeListField;
        ?? r0;
        InterfaceC57972PnI interfaceC57972PnI;
        C2JS A05;
        ImmutableList optionalCompactedTreeListField2;
        ArrayList A0q;
        C2JS A052;
        ImmutableList optionalCompactedTreeListField3;
        C2JS A035;
        ImmutableList optionalCompactedTreeListField4;
        Object Bos;
        Object Bos2;
        Object Bos3;
        IGLiveBadgeSettings iGLiveBadgeSettings;
        C2JS A0k2;
        C2JS A053;
        String requiredStringField;
        C2045893s c2045893s;
        TreeJNI treeJNI;
        InterfaceC128135qh interfaceC128135qh;
        C2JL c2jl;
        List list2;
        C213109cX c213109cX;
        C2JS A0k3;
        C2JS A036;
        Object Bos4;
        C2JS optionalTreeField;
        Object A0z;
        switch (this.A00) {
            case 0:
                c2jl = ((C51398Mn5) this.A01).A04;
                if (c2jl == null) {
                    C14360o3.A0F("deletionCallback");
                    throw C00O.createAndThrow();
                }
                c2jl.onSuccess(anonymousClass436);
                return;
            case 1:
                C215059fh c215059fh = (C215059fh) this.A01;
                C6FQ c6fq = c215059fh.A02;
                if (c6fq == null || c6fq.A03 == null) {
                    return;
                }
                if (anonymousClass436 == null || (A0k3 = AbstractC25225BEi.A0k(anonymousClass436)) == null || (A036 = A0k3.A03(C213069cT.class, "meta_ai_bloks_actions(bk_context:$bk_context,params:$params)", -1877186104)) == null || (list2 = A036.A06(C213059cS.class, "edges", -1423785097)) == null) {
                    list2 = C16930sl.A00;
                }
                Iterator it = list2.subList(c215059fh.A00, list2.size()).iterator();
                while (it.hasNext()) {
                    C2JS A037 = ((C2JS) it.next()).A03(C213049cR.class, "node", 88772458);
                    if (A037 != null) {
                        c213109cX = (C213109cX) A037.A01(C213109cX.class, 1583155594);
                    } else {
                        c213109cX = null;
                    }
                    AbstractC115105If A00 = c215059fh.A03.A00(c213109cX);
                    if (A00 instanceof C115115Ig) {
                        A00 = new C115115Ig(new C209899Qb((C66246U5q) ((C115115Ig) A00).A00, 1, 0L, 0L));
                    } else if (!(A00 instanceof C115095Ie)) {
                        throw B4Z.A00();
                    }
                    C1W2.A00().A01(new RunnableC24583Aue(c215059fh, A00));
                }
                c215059fh.A00 = list2.size();
                return;
            case 2:
                if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A03 = A0k.A03(QY0.class, "cam_creator_profile", 265934746)) != null && (A032 = A03.A03(C59119QXz.class, "creator_profile", -1587776802)) != null && (A033 = A032.A03(C59118QXy.class, "creator_projects(first:$first,query_params:{\"project_states\":$project_states})", 564437363)) != null && (A06 = A033.A06(C59117QXx.class, "nodes", -2020547369)) != null) {
                    BrandedContentProjectRepository.A00((BrandedContentProjectRepository) this.A01, A06);
                    return;
                }
                c05a = ((BrandedContentProjectRepository) this.A01).A01;
                c51758Mth = new C51758Mth(null, 1, 9, true);
                c05a.Egh(c51758Mth);
                return;
            case 3:
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                c2jl = (C2JL) this.A01;
                c2jl.onSuccess(anonymousClass436);
                return;
            case 4:
                if (anonymousClass436 != null && anonymousClass436.Bos() != null) {
                    ((InterfaceC58044PoU) this.A01).onSuccess();
                    return;
                } else {
                    ((InterfaceC58044PoU) this.A01).DFf();
                    return;
                }
            case 6:
                ((InterfaceC24741Ir) this.A01).F8s(AbstractC25225BEi.A0z(anonymousClass436));
                return;
            case 7:
                ((AbstractC62502sp) this.A01).onSuccess(anonymousClass436);
                return;
            case 8:
                C2JS A0k4 = AbstractC25225BEi.A0k(anonymousClass436);
                List list3 = null;
                if (A0k4 != null && (A034 = A0k4.A03(C58515Pwj.class, "xdt_nf_suggested_users", -1004888445)) != null && (optionalCompactedTreeListField = A034.getOptionalCompactedTreeListField(0, DialogModule.KEY_ITEMS, C58518Pwm.class, 665038953)) != null) {
                    C50576MUh c50576MUh = (C50576MUh) this.A01;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = optionalCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        C2JS c2js = (C2JS) it2.next();
                        String optionalStringField = c2js.getOptionalStringField(13, "uuid");
                        if (optionalStringField != null) {
                            ImmutableList optionalCompactedTreeListField5 = c2js.getOptionalCompactedTreeListField(10, "social_context_facepile_users", C58522Pwq.class, 747146543);
                            if (optionalCompactedTreeListField5 != null) {
                                r0 = new ArrayList(AbstractC06950Ym.A1E(optionalCompactedTreeListField5, 10));
                                Iterator it3 = optionalCompactedTreeListField5.iterator();
                                while (it3.hasNext()) {
                                    C2JS reinterpretRequired = ((C2JS) it3.next()).reinterpretRequired(0, C58521Pwp.class, 239174565);
                                    C1DV c1dv = c50576MUh.A01;
                                    Parcelable.Creator creator = User.CREATOR;
                                    r0.add(AbstractC38851rI.A01(new C1DY(c1dv, (java.util.Set) new HashSet(), false), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class)));
                                }
                            } else {
                                r0 = C16930sl.A00;
                            }
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) r0);
                            C2JS reinterpretRequired2 = c2js.getRequiredTreeField(12, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C58519Pwn.class, -1764806567).reinterpretRequired(0, C58520Pwo.class, 739732649);
                            C1DV c1dv2 = c50576MUh.A01;
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A01 = AbstractC38851rI.A01(new C1DY(c1dv2, (java.util.Set) new HashSet(), false), (ImmutablePandoUserDict) reinterpretRequired2.reinterpret(ImmutablePandoUserDict.class));
                            C14360o3.A07(A01);
                            String id = A01.getId();
                            String requiredStringField2 = c2js.getRequiredStringField(9, "social_context");
                            C14360o3.A07(requiredStringField2);
                            String requiredStringField3 = c2js.getRequiredStringField(0, "algorithm");
                            C14360o3.A07(requiredStringField3);
                            c2js.getCoercedBooleanField(5, "is_new_suggestion");
                            A1E.add(new MUX(copyOf, A01, id, requiredStringField2, requiredStringField3, optionalStringField, c2js.getCoercedBooleanField(3, "followed_by")));
                        }
                    }
                    list3 = AbstractC001800i.A0a(A1E);
                }
                C05A c05a2 = ((C50576MUh) this.A01).A04;
                do {
                    value = c05a2.getValue();
                    if (list3 == null) {
                        list = C16930sl.A00;
                    } else {
                        list = list3;
                    }
                } while (!c05a2.AIi(value, new MU9(list, 1)));
                return;
            case 9:
                interfaceC57972PnI = (InterfaceC57972PnI) this.A01;
                C2JS A0k5 = AbstractC25225BEi.A0k(anonymousClass436);
                if (A0k5 != null && (A05 = A0k5.A05(C60128QuQ.class, "xdt_share_highlight_to_main_grid(request_data:{\"highlight_ids\":$highlight_ids})", -156928128)) != null && (optionalCompactedTreeListField2 = A05.getOptionalCompactedTreeListField(2, "highlights", C60127QuP.class, 703840499)) != null) {
                    A0q = AbstractC167017dG.A0q(optionalCompactedTreeListField2);
                    Iterator it4 = optionalCompactedTreeListField2.iterator();
                    while (it4.hasNext()) {
                        C2JS c2js2 = (C2JS) it4.next();
                        A0q.add(new C32061E6n(c2js2.getRequiredStringField(0, "strong_id__"), c2js2.getCoercedBooleanField(1, AbstractC58317Pt9.A00(42)), c2js2.A00("updated_timestamp")));
                    }
                    interfaceC57972PnI.DqF(A0q);
                    return;
                }
                A0q = null;
                interfaceC57972PnI.DqF(A0q);
                return;
            case 10:
                interfaceC57972PnI = (InterfaceC57972PnI) this.A01;
                C2JS A0k6 = AbstractC25225BEi.A0k(anonymousClass436);
                if (A0k6 != null && (A052 = A0k6.A05(C60131QuT.class, "xdt_share_or_unshare_highlight_to_main_grid(request_data:{\"highlight_ids\":$highlight_ids})", -2094887911)) != null && (optionalCompactedTreeListField3 = A052.getOptionalCompactedTreeListField(2, "highlights", C60130QuS.class, 1815679295)) != null) {
                    A0q = AbstractC167017dG.A0q(optionalCompactedTreeListField3);
                    Iterator it5 = optionalCompactedTreeListField3.iterator();
                    while (it5.hasNext()) {
                        C2JS c2js3 = (C2JS) it5.next();
                        A0q.add(new C32061E6n(c2js3.getRequiredStringField(0, "strong_id__"), c2js3.getCoercedBooleanField(1, AbstractC58317Pt9.A00(42)), c2js3.A00("updated_timestamp")));
                    }
                    interfaceC57972PnI.DqF(A0q);
                    return;
                }
                A0q = null;
                interfaceC57972PnI.DqF(A0q);
                return;
            case 11:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC57972PnI = (InterfaceC57972PnI) this.A01;
                C2JS A0k7 = AbstractC25225BEi.A0k(anonymousClass436);
                if (A0k7 != null && (A035 = A0k7.A03(C60139Qub.class, "xdt_unshare_all_highlights_from_main_grid", -430566365)) != null && (optionalCompactedTreeListField4 = A035.getOptionalCompactedTreeListField(2, "highlights", C60138Qua.class, 1268652758)) != null) {
                    A0q = AbstractC167017dG.A0q(optionalCompactedTreeListField4);
                    Iterator it6 = optionalCompactedTreeListField4.iterator();
                    while (it6.hasNext()) {
                        C2JS c2js4 = (C2JS) it6.next();
                        A0q.add(new C32061E6n(c2js4.getRequiredStringField(0, "strong_id__"), c2js4.getCoercedBooleanField(1, AbstractC58317Pt9.A00(42)), c2js4.A00("updated_timestamp")));
                    }
                    interfaceC57972PnI.DqF(A0q);
                    return;
                }
                A0q = null;
                interfaceC57972PnI.DqF(A0q);
                return;
            case 14:
                if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                    ((InterfaceC58072Pox) this.A01).Dq5((C213849dj) Bos);
                    return;
                } else {
                    ((InterfaceC58072Pox) this.A01).DFf();
                    return;
                }
            case Process.SIGTERM /* 15 */:
                if (anonymousClass436 != null && (Bos2 = anonymousClass436.Bos()) != null) {
                    ((InterfaceC58074Poz) this.A01).Dq4((C9MA) Bos2);
                    return;
                } else {
                    ((InterfaceC58074Poz) this.A01).DFf();
                    return;
                }
            case 16:
                if (anonymousClass436 != null && (Bos3 = anonymousClass436.Bos()) != null) {
                    ((InterfaceC58073Poy) this.A01).Dq3((C213789dd) Bos3);
                    return;
                } else {
                    ((InterfaceC58073Poy) this.A01).DFf();
                    return;
                }
            case 17:
                if (anonymousClass436 != null && (A0k2 = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A053 = A0k2.A05(Qn0.class, "xdt_live_badge_setting_subscribe(input:$input)", 66997956)) != null && (requiredStringField = A053.getRequiredStringField(2, "badge_setting")) != null) {
                    iGLiveBadgeSettings = AbstractC109824x9.A00(requiredStringField);
                } else {
                    iGLiveBadgeSettings = IGLiveBadgeSettings.A07;
                }
                c05a = ((OCR) this.A01).A02;
                c51758Mth = Boolean.valueOf(AbstractC167007dF.A1X(iGLiveBadgeSettings, IGLiveBadgeSettings.A05));
                c05a.Egh(c51758Mth);
                return;
            case 18:
                C55092Ob3 c55092Ob3 = (C55092Ob3) this.A01;
                if (anonymousClass436 == null || (Bos4 = anonymousClass436.Bos()) == null || (optionalTreeField = ((C2JS) Bos4).getOptionalTreeField(0, "ig_fundraiser_nudge_decision(post_text:$post_text)", C59880QqQ.class, 47690923)) == null) {
                    return;
                }
                double coercedDoubleField = optionalTreeField.getCoercedDoubleField(0, "fundraiser_intent_score");
                if (coercedDoubleField < c55092Ob3.A09 || c55092Ob3.A01 == null) {
                    return;
                }
                UserSession userSession = c55092Ob3.A0B;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36317959987861218L) || coercedDoubleField < C18U.A00(c06090Tz, userSession, 37162384917856481L)) {
                    return;
                }
                if (c55092Ob3.A00 != null) {
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                    int i = A0x.getInt("has_seen_fundraiser_caption_intent_upsell_in_feed_composer_count", 0);
                    if (i < c55092Ob3.A0E.longValue()) {
                        AbstractC59962oe abstractC59962oe = c55092Ob3.A0A;
                        C5SU c5su = new C5SU(abstractC59962oe.requireActivity(), new C149686oL(abstractC59962oe.getString(2131962967)));
                        c5su.A03(c55092Ob3.A00);
                        c5su.A02();
                        c5su.A00().A07(userSession);
                        AbstractC167007dF.A18(A0x, "has_seen_fundraiser_caption_intent_upsell_in_feed_composer_count", i + 1);
                    }
                }
                c55092Ob3.A01.setVisibility(0);
                AbstractC55215Oed.A07(c55092Ob3.A0A, userSession, "ml_fundraiser_creation_nudge", "FEED_COMPOSER", null, null, null);
                return;
            case Process.SIGSTOP /* 19 */:
                OWU.A00(((C56810PJc) this.A01).A01, C05F.A0N);
                return;
            case 20:
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                C29839DEf c29839DEf = C29839DEf.A00;
                if (anonymousClass436 == null) {
                    A0z = AbstractC43592JPx.A0p(c29839DEf.invoke());
                } else {
                    A0z = AbstractC25225BEi.A0z(anonymousClass436);
                }
                interfaceC24741Ir.F8s(A0z);
                if (!anonymousClass436.C3z().isFinal) {
                    return;
                }
                interfaceC24741Ir.AID(null);
                return;
            case 21:
                User user = null;
                if (anonymousClass436 != null && (treeJNI = (TreeJNI) anonymousClass436.Bos()) != null && (interfaceC128135qh = (InterfaceC128135qh) treeJNI.getTreeValue("xdt_users__info(user_id:$user_id)", C52635NQi.class)) != null) {
                    C128125qg F3d = interfaceC128135qh.F3d(C1DS.A00(AbstractC166987dD.A0r(((N5R) this.A01).A07)));
                    c2045893s = new C2045893s();
                    c2045893s.A04 = F3d;
                } else {
                    c2045893s = null;
                }
                InterfaceC74953Yl interfaceC74953Yl = ((N5R) this.A01).A04;
                interfaceC74953Yl.Egh(null);
                if (c2045893s != null) {
                    user = C72W.A00(c2045893s);
                }
                interfaceC74953Yl.Egh(user);
                return;
        }
    }
}
