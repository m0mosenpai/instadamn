package com.instagram.tagging.widget;

import X.AbstractC125325le;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC38048Gob;
import X.AbstractC50524MSc;
import X.AbstractC50789Mc6;
import X.AbstractC55216Oef;
import X.AbstractC83893oY;
import X.C00O;
import X.C0f9;
import X.C124375jt;
import X.C124405jw;
import X.C14360o3;
import X.C150956qv;
import X.C39384HaQ;
import X.C39385HaR;
import X.C39386HaS;
import X.C50776Mbi;
import X.C51415MnN;
import X.C54788OJf;
import X.C55136Oc4;
import X.C55344OhA;
import X.C55942hf;
import X.EnumC53230NgS;
import X.EnumC53319Nhv;
import X.InterfaceC11380iw;
import X.InterfaceC58082Pp7;
import X.InterfaceC58084Pp9;
import X.InterfaceC58159PqO;
import X.MSW;
import X.MSZ;
import X.NX8;
import X.OUL;
import X.OWJ;
import X.PHF;
import X.PHH;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class TagsInteractiveLayout extends TagsLayout implements InterfaceC11380iw, InterfaceC58082Pp7 {
    public float A00;
    public float A01;
    public long A02;
    public EnumC53319Nhv A03;
    public AbstractC50789Mc6 A04;
    public AbstractC50789Mc6 A05;
    public InterfaceC58084Pp9 A06;
    public C54788OJf A07;
    public InterfaceC58159PqO A08;
    public ArrayList A09;
    public ArrayList A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public UserSession A0J;
    public PeopleTag A0K;
    public MediaTaggingInfo A0L;
    public final PointF A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final GestureDetector A0P;

    private void A00(Tag tag, boolean z) {
        if (tag.A01() == EnumC53319Nhv.A07) {
            PeopleTag peopleTag = (PeopleTag) tag;
            MediaTaggingInfo mediaTaggingInfo = this.A0L;
            if (mediaTaggingInfo != null) {
                mediaTaggingInfo.A0B.add(peopleTag);
                mediaTaggingInfo.A0F.add(peopleTag);
            }
            if (z) {
                this.A08.A89(peopleTag.A07());
                AbstractC31173DnH.A1X(peopleTag.A07(), this.A09);
            }
        } else {
            MediaTaggingInfo mediaTaggingInfo2 = this.A0L;
            if (mediaTaggingInfo2 != null) {
                mediaTaggingInfo2.A0C.add(tag);
            }
        }
        AbstractC50789Mc6 A02 = A02(this.A0J, null, tag, null, false, false, false, false);
        if (A02 instanceof C39384HaQ) {
            ((C39384HaQ) A02).A06 = new PHH(this);
        }
        if (A02 instanceof C39385HaR) {
            ((C39385HaR) A02).A04 = new PHF(this);
        }
        AVh();
    }

    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) getChildAt(i);
            Tag tag = (Tag) abstractC50789Mc6.getTag();
            if (tag != null && tag.A01() == EnumC53319Nhv.A09 && !abstractC50789Mc6.A04) {
                abstractC50789Mc6.startAnimation(alphaAnimation);
                abstractC50789Mc6.A04 = true;
            }
        }
        A03();
    }

    @Override // X.InterfaceC58082Pp7
    public final void AVh() {
        super.A01 = true;
        removeView(this.A05);
        this.A05 = null;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) getChildAt(i);
            Tag tag = (Tag) abstractC50789Mc6.getTag();
            if ((this.A03 != EnumC53319Nhv.A07 || tag == null || tag.A01() != EnumC53319Nhv.A09) && !abstractC50789Mc6.A04) {
                abstractC50789Mc6.startAnimation(alphaAnimation);
                abstractC50789Mc6.A04 = true;
            }
        }
        this.A08.Ds0(this.A0K);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "tags_interactive_layout";
    }

    /* loaded from: classes9.dex */
    public class UnnamedTagSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C55344OhA.A00(4);
        public PointF A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.A00.x);
            parcel.writeFloat(this.A00.y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static void A01(TagsInteractiveLayout tagsInteractiveLayout, Product product, boolean z) {
        boolean z2;
        String str;
        PointF pointF;
        EnumC53230NgS enumC53230NgS;
        AbstractC50789Mc6 abstractC50789Mc6 = tagsInteractiveLayout.A05;
        if (abstractC50789Mc6 != null) {
            Iterator it = tagsInteractiveLayout.A0B.iterator();
            while (it.hasNext()) {
                if (MSZ.A0v(it).equals(product.A0H)) {
                    tagsInteractiveLayout.AVh();
                    return;
                }
            }
            Iterator it2 = tagsInteractiveLayout.A0C.iterator();
            while (true) {
                if (it2.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it2.next();
                    if (z && mediaSuggestedProductTag.A07() != null && MSW.A13(mediaSuggestedProductTag).equals(product.A0H) && (enumC53230NgS = mediaSuggestedProductTag.A01) != EnumC53230NgS.A04 && enumC53230NgS != EnumC53230NgS.A05) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!tagsInteractiveLayout.A0C.isEmpty()) {
                Iterator it3 = tagsInteractiveLayout.A0C.iterator();
                boolean z3 = false;
                while (it3.hasNext()) {
                    MediaSuggestedProductTag mediaSuggestedProductTag2 = (MediaSuggestedProductTag) it3.next();
                    AbstractC50789Mc6 abstractC50789Mc62 = tagsInteractiveLayout.A05;
                    if (abstractC50789Mc62 != null && (pointF = mediaSuggestedProductTag2.A00) != null && pointF.equals(AbstractC50789Mc6.A01(abstractC50789Mc62).A06)) {
                        if (mediaSuggestedProductTag2.A01 == EnumC53230NgS.A04 && !z3) {
                            tagsInteractiveLayout.A08.Dqi(mediaSuggestedProductTag2, product, z);
                            z3 = true;
                        }
                    } else {
                        EnumC53230NgS enumC53230NgS2 = mediaSuggestedProductTag2.A01;
                        EnumC53230NgS enumC53230NgS3 = EnumC53230NgS.A04;
                        if (enumC53230NgS2 != enumC53230NgS3 || mediaSuggestedProductTag2.A07() == null || !MSW.A13(mediaSuggestedProductTag2).equals(product.A0H)) {
                            if (z && mediaSuggestedProductTag2.A07() != null && MSW.A13(mediaSuggestedProductTag2).equals(product.A0H) && mediaSuggestedProductTag2.A01 != enumC53230NgS3) {
                                if (!z3) {
                                    tagsInteractiveLayout.A08.Dqi(mediaSuggestedProductTag2, product, z);
                                    z3 = true;
                                }
                                tagsInteractiveLayout.A08.Ds0(null);
                                it3.remove();
                            }
                        }
                    }
                    tagsInteractiveLayout.removeView(tagsInteractiveLayout.findViewWithTag(mediaSuggestedProductTag2));
                    tagsInteractiveLayout.A08.Ds0(null);
                    it3.remove();
                }
            }
            PointF pointF2 = AbstractC50789Mc6.A01(abstractC50789Mc6).A06;
            ?? obj = new Object();
            obj.A03 = null;
            obj.A01 = null;
            obj.A00 = pointF2;
            obj.A02 = product.A01;
            if (!z) {
                str = EnumC53230NgS.A04.A00;
            } else {
                if (z2) {
                    str = "low_confidence";
                }
                tagsInteractiveLayout.A00(obj, false);
            }
            obj.A03 = str;
            tagsInteractiveLayout.A00(obj, false);
        }
    }

    @Override // com.instagram.tagging.widget.TagsLayout
    public final void A05(AbstractC50789Mc6 abstractC50789Mc6) {
        float f;
        float f2;
        if (abstractC50789Mc6 != null && this.A0G) {
            C54788OJf c54788OJf = this.A07;
            if (c54788OJf.A00(AbstractC50789Mc6.A01(abstractC50789Mc6).A0B)) {
                Rect rect = AbstractC50789Mc6.A01(abstractC50789Mc6).A0B;
                PointF pointF = AbstractC50789Mc6.A01(abstractC50789Mc6).A07;
                AbstractC167017dG.A1N(rect, pointF);
                int i = rect.right;
                int i2 = rect.left;
                int i3 = i - i2;
                int i4 = rect.bottom;
                int i5 = rect.top;
                int i6 = i4 - i5;
                int i7 = c54788OJf.A01;
                if (i2 < i7) {
                    f = i7 + (i3 / 2.0f);
                } else {
                    int i8 = c54788OJf.A02;
                    if (i > i8) {
                        f = i8 - (i3 / 2.0f);
                    } else {
                        f = pointF.x;
                    }
                }
                int i9 = c54788OJf.A03;
                if (i5 < i9) {
                    f2 = i9;
                } else {
                    int i10 = c54788OJf.A00;
                    if (i4 > i10) {
                        f2 = i10 - i6;
                    } else {
                        f2 = pointF.y;
                    }
                }
                abstractC50789Mc6.setPosition(new PointF(f, f2));
                abstractC50789Mc6.A04();
                C124405jw[] c124405jwArr = c54788OJf.A06;
                int i11 = 0;
                do {
                    c124405jwArr[i11].A00 = false;
                    i11++;
                } while (i11 < 4);
            }
        }
    }

    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) getChildAt(i);
            Tag tag = (Tag) abstractC50789Mc6.getTag();
            if (tag != null && tag.A01() == EnumC53319Nhv.A09 && abstractC50789Mc6.A04) {
                abstractC50789Mc6.setAnimation(alphaAnimation);
                abstractC50789Mc6.A04 = false;
            }
        }
        A03();
    }

    public final void A08(PointF pointF) {
        AbstractC50789Mc6 c39386HaS;
        String str;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
        alphaAnimation.setFillAfter(true);
        for (int i = 0; i < getChildCount(); i++) {
            if (AbstractC50789Mc6.A01((AbstractC50789Mc6) getChildAt(i)).A06 == pointF) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setFillAfter(true);
            }
            AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) getChildAt(i);
            if (abstractC50789Mc6.A04) {
                abstractC50789Mc6.setAnimation(alphaAnimation);
                abstractC50789Mc6.A04 = false;
            }
        }
        super.A01 = false;
        EnumC53319Nhv enumC53319Nhv = this.A03;
        String string = getResources().getString(2131969525);
        UserSession userSession = this.A0J;
        if (enumC53319Nhv == EnumC53319Nhv.A07) {
            c39386HaS = new C39384HaQ(getContext(), pointF, userSession, null, false);
        } else if (enumC53319Nhv == EnumC53319Nhv.A05) {
            c39386HaS = new C39385HaR(getContext(), pointF, userSession, null, false);
        } else {
            EnumC53319Nhv enumC53319Nhv2 = EnumC53319Nhv.A09;
            Context context = getContext();
            if (enumC53319Nhv == enumC53319Nhv2) {
                c39386HaS = new NX8(context, pointF, userSession, null, true);
            } else {
                c39386HaS = new C39386HaS(context, pointF, userSession, null, null, null, false, false, false);
                c39386HaS.setVisibility(8);
            }
        }
        c39386HaS.setText(string);
        this.A05 = c39386HaS;
        if (c39386HaS instanceof C39384HaQ) {
            ((C39384HaQ) c39386HaS).A06 = new PHH(this);
        }
        addView(c39386HaS);
        TaggingActivity taggingActivity = (TaggingActivity) this.A08;
        C14360o3.A0B(pointF, 0);
        TaggingActivity.A0B(taggingActivity);
        OUL oul = taggingActivity.A0H;
        if (oul == null) {
            str = "taggingTypeIndicatorController";
        } else {
            oul.A01.setVisibility(8);
            oul.A02.setVisibility(0);
            ImageView imageView = oul.A03;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A01(imageView, 0).A0G();
            oul.A00.removeCallbacks(oul.A05);
            C55136Oc4 c55136Oc4 = taggingActivity.A0F;
            if (c55136Oc4 == null) {
                str = "helpTextController";
            } else {
                c55136Oc4.A03(false, AbstractC167007dF.A1W(taggingActivity.A0E));
                PhotoScrollView photoScrollView = taggingActivity.A0J;
                if (photoScrollView != null) {
                    photoScrollView.setScrollTarget(pointF.y);
                }
                if (this.A0G) {
                    post(new Runnable() { // from class: X.POS
                        @Override // java.lang.Runnable
                        public final void run() {
                            TagsInteractiveLayout tagsInteractiveLayout = TagsInteractiveLayout.this;
                            tagsInteractiveLayout.A05(tagsInteractiveLayout.A05);
                        }
                    });
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A09(Tag tag) {
        String str;
        String str2;
        EnumC53319Nhv A01 = tag.A01();
        if (A01 == EnumC53319Nhv.A07) {
            MediaTaggingInfo mediaTaggingInfo = this.A0L;
            if (mediaTaggingInfo != null) {
                this.A0K = null;
                PeopleTag peopleTag = (PeopleTag) tag;
                C14360o3.A0B(peopleTag, 0);
                mediaTaggingInfo.A0B.remove(peopleTag);
                TaggingActivity taggingActivity = (TaggingActivity) this.A08;
                String id = peopleTag.A07().getId();
                TaggingActivity.A0O(taggingActivity, peopleTag.A07());
                if (TaggingActivity.A0S(taggingActivity)) {
                    List list = taggingActivity.A0P;
                    str2 = "taggedSellerIds";
                    if (list != null) {
                        if (list.contains(id)) {
                            List list2 = taggingActivity.A0P;
                            if (list2 != null) {
                                list2.remove(id);
                                List list3 = taggingActivity.A0P;
                                if (list3 != null) {
                                    if (list3.isEmpty()) {
                                        TaggingActivity.A0I(taggingActivity);
                                    }
                                    TaggingActivity.A0E(taggingActivity);
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
            }
            this.A09.remove(tag.getId());
            removeView(findViewWithTag(tag));
        }
        EnumC53319Nhv enumC53319Nhv = EnumC53319Nhv.A05;
        MediaTaggingInfo mediaTaggingInfo2 = this.A0L;
        if (A01 == enumC53319Nhv) {
            if (mediaTaggingInfo2 != null) {
                mediaTaggingInfo2.A0A.remove(tag);
            }
        } else if (mediaTaggingInfo2 != null) {
            ProductTag productTag = (ProductTag) tag;
            C14360o3.A0B(productTag, 0);
            mediaTaggingInfo2.A0C.remove(productTag);
            ProductAutoTagMetadata productAutoTagMetadata = productTag.A01;
            if (productAutoTagMetadata != null) {
                TaggingActivity taggingActivity2 = (TaggingActivity) this.A08;
                UserSession A0r = AbstractC166987dD.A0r(taggingActivity2.A0o);
                String str3 = taggingActivity2.A0L;
                if (str3 == null) {
                    str2 = "_shoppingCreationSessionId";
                } else {
                    boolean z = !TaggingActivity.A0U(taggingActivity2);
                    int i = taggingActivity2.A00;
                    String str4 = AbstractC38048Gob.A01(productTag.A02).A0H;
                    String str5 = AbstractC38048Gob.A01(productTag.A02).A0H;
                    Float f = productAutoTagMetadata.A01;
                    PointF pointF = productAutoTagMetadata.A00;
                    C51415MnN A02 = TaggingActivity.A02(taggingActivity2);
                    EnumC53230NgS enumC53230NgS = EnumC53230NgS.A05;
                    String str6 = taggingActivity2.A0M;
                    if (str6 == null) {
                        str2 = "priorSubmodule";
                    } else {
                        if (TaggingActivity.A0S(taggingActivity2)) {
                            str = "opt";
                        } else {
                            str = "seller";
                        }
                        AbstractC55216Oef.A05(pointF, A02, taggingActivity2, A0r, enumC53230NgS, f, null, str3, "remove", str4, str5, str6, "feed", str, i, z);
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        removeView(findViewWithTag(tag));
    }

    @Override // X.InterfaceC58082Pp7
    public final void AAT(User user, boolean z) {
        AbstractC50789Mc6 abstractC50789Mc6 = this.A05;
        if (abstractC50789Mc6 != null) {
            PeopleTag peopleTag = new PeopleTag(AbstractC50789Mc6.A01(abstractC50789Mc6).A06, user);
            this.A0K = peopleTag;
            peopleTag.A09(user);
            A00(peopleTag, z);
        }
    }

    public ArrayList getSuggestedProductTags() {
        return this.A0C;
    }

    @Override // com.instagram.tagging.widget.TagsLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (AbstractC166987dD.A01((i3 - i) / (i4 - i2), 0.5625f) < 0.01d) {
            Rect rect = this.A0O;
            rect.set(i, i2, i3, i4);
            C54788OJf c54788OJf = this.A07;
            Rect rect2 = c54788OJf.A04;
            if (!C14360o3.A0K(rect2, rect)) {
                rect2.set(rect);
                int i5 = rect.right;
                int i6 = rect.left;
                int i7 = rect.bottom;
                int i8 = rect.top;
                int i9 = (int) ((i5 - i6) * 0.055f);
                float f = i7 - i8;
                int i10 = (int) (0.15f * f);
                int i11 = (int) (f * 0.25f);
                c54788OJf.A01 = i6 + i9;
                c54788OJf.A02 = i5 - i9;
                c54788OJf.A03 = i8 + i10;
                c54788OJf.A00 = i7 - i11;
                C124375jt[] c124375jtArr = c54788OJf.A05;
                for (int i12 = 0; i12 < 4; i12++) {
                    C124375jt c124375jt = c124375jtArr[i12];
                    c124375jt.A03(rect2);
                    c124375jt.A01 = true;
                }
                c124375jtArr[0].A06.A00(i9, 0, 0, 0);
                c124375jtArr[1].A06.A00(0, 0, i9, 0);
                c124375jtArr[2].A06.A00(0, i10, 0, 0);
                c124375jtArr[3].A06.A00(0, 0, 0, i11);
                C124405jw[] c124405jwArr = c54788OJf.A06;
                c124405jwArr[0].A01.setBounds(rect2.left, rect2.top, c54788OJf.A01, rect2.bottom);
                c124405jwArr[1].A01.setBounds(c54788OJf.A02, rect2.top, rect2.right, rect2.bottom);
                c124405jwArr[2].A01.setBounds(rect2.left, rect2.top, rect2.right, c54788OJf.A03);
                c124405jwArr[3].A01.setBounds(rect2.left, c54788OJf.A00, rect2.right, rect2.bottom);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.A0G = z2;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof UnnamedTagSavedState) {
            UnnamedTagSavedState unnamedTagSavedState = (UnnamedTagSavedState) parcelable;
            super.onRestoreInstanceState(unnamedTagSavedState.getSuperState());
            A08(unnamedTagSavedState.A00);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setEditingTagType(EnumC53319Nhv enumC53319Nhv) {
        this.A03 = enumC53319Nhv;
        if (enumC53319Nhv == EnumC53319Nhv.A08) {
            A07();
        } else {
            if (this.A0H) {
                return;
            }
            A06();
        }
    }

    public void setSuggestedProductTags(ArrayList arrayList, boolean z, UserSession userSession) {
        this.A0C = arrayList;
        this.A0J = userSession;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!AbstractC83893oY.A00(arrayList)) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
                EnumC53230NgS enumC53230NgS = mediaSuggestedProductTag.A01;
                if (enumC53230NgS == EnumC53230NgS.A04 || enumC53230NgS == EnumC53230NgS.A07) {
                    A1E.add(mediaSuggestedProductTag);
                }
            }
        }
        super.setTags(A1E, z, this.A0J);
    }

    public void setTags(MediaTaggingInfo mediaTaggingInfo, boolean z, UserSession userSession) {
        this.A0L = mediaTaggingInfo;
        this.A0A = mediaTaggingInfo.A0B;
        this.A0B = mediaTaggingInfo.A0C;
        this.A09 = AbstractC166987dD.A1F(AbstractC166987dD.A1F(mediaTaggingInfo.A0E));
        ArrayList arrayList = mediaTaggingInfo.A0D;
        if (arrayList != null) {
            this.A0C = arrayList;
        }
        this.A0J = userSession;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(this.A0A);
        A1E.addAll(this.A0B);
        if (OWJ.A00.A01(userSession, mediaTaggingInfo.A07, false)) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(mediaTaggingInfo.A0A);
            while (A13.hasNext()) {
                FBUserTag fBUserTag = (FBUserTag) AbstractC166997dE.A0l(A13);
                if (fBUserTag.A01 == FBTagType.A05) {
                    A1E2.add(fBUserTag);
                }
            }
            A1E.addAll(A1E2);
        }
        if (!AbstractC83893oY.A00(this.A0C)) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
                EnumC53230NgS enumC53230NgS = mediaSuggestedProductTag.A01;
                if (enumC53230NgS == EnumC53230NgS.A04 || enumC53230NgS == EnumC53230NgS.A07) {
                    A1E.add(mediaSuggestedProductTag);
                }
            }
        }
        super.setTags(A1E, z, this.A0J);
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0P = new GestureDetector(getContext(), new C50776Mbi(this));
        boolean A0O = AbstractC50524MSc.A0O(this);
        this.A0M = new PointF();
        this.A0O = AbstractC166987dD.A0U();
        this.A0N = AbstractC166987dD.A0U();
        setWillNotDraw(A0O);
        this.A07 = new C54788OJf(context);
    }

    public final void A0A(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            removeView(findViewWithTag(it.next()));
        }
        this.A0C.clear();
        this.A08.Ds0(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0G) {
            C54788OJf c54788OJf = this.A07;
            C14360o3.A0B(canvas, 0);
            C124375jt[] c124375jtArr = c54788OJf.A05;
            int i = 0;
            int i2 = 0;
            do {
                c124375jtArr[i2].A02(canvas);
                i2++;
            } while (i2 < 4);
            C124405jw[] c124405jwArr = c54788OJf.A06;
            do {
                C124405jw c124405jw = c124405jwArr[i];
                if (c124405jw.A00) {
                    c124405jw.A01.draw(canvas);
                }
                i++;
            } while (i < 4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (this.A05 == null) {
            return onSaveInstanceState;
        }
        ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.A00 = AbstractC50789Mc6.A01(this.A05).A06;
        return baseSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-212043952);
        int action = motionEvent.getAction();
        AbstractC50789Mc6 abstractC50789Mc6 = this.A04;
        if (abstractC50789Mc6 != null && (action == 1 || action == 3)) {
            A05(abstractC50789Mc6);
            InterfaceC58159PqO interfaceC58159PqO = this.A08;
            PointF pointF = AbstractC50789Mc6.A01(abstractC50789Mc6).A06;
            C14360o3.A0B(pointF, 0);
            PhotoScrollView photoScrollView = ((TaggingActivity) interfaceC58159PqO).A0J;
            if (photoScrollView != null) {
                photoScrollView.setScrollTarget(pointF.y);
            }
            if (abstractC50789Mc6.getTag() != null) {
                ((Tag) abstractC50789Mc6.getTag()).A00 = AbstractC50789Mc6.A01(abstractC50789Mc6).A06;
            }
        }
        boolean onTouchEvent = this.A0P.onTouchEvent(motionEvent);
        if (this.A0G && ((this.A04 != null || this.A05 != null) && (action == 1 || action == 3))) {
            C124375jt[] c124375jtArr = this.A07.A05;
            int i = 0;
            do {
                c124375jtArr[i].A00();
                i++;
            } while (i < 4);
            invalidate();
        }
        C0f9.A0C(697980870, A05);
        return onTouchEvent;
    }

    public void setDisableRemovingCollabs(boolean z) {
        this.A0D = z;
    }

    public void setDisableRemovingTags(boolean z) {
        this.A0E = z;
    }

    public void setListener(InterfaceC58159PqO interfaceC58159PqO) {
        this.A08 = interfaceC58159PqO;
    }

    public void setShouldShowSuggestedProductsOnPeopleTab(boolean z) {
        this.A0H = z;
    }

    public void setTaggingEditProvider(InterfaceC58084Pp9 interfaceC58084Pp9) {
        this.A06 = interfaceC58084Pp9;
    }

    public TagsInteractiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0P = new GestureDetector(getContext(), new C50776Mbi(this));
        boolean A0O = AbstractC50524MSc.A0O(this);
        this.A0M = new PointF();
        this.A0O = AbstractC166987dD.A0U();
        this.A0N = AbstractC166987dD.A0U();
        setWillNotDraw(A0O);
        this.A07 = new C54788OJf(context);
    }

    public TagsInteractiveLayout(Context context) {
        super(context);
        this.A0P = new GestureDetector(getContext(), new C50776Mbi(this));
        boolean A0O = AbstractC50524MSc.A0O(this);
        this.A0M = new PointF();
        this.A0O = AbstractC166987dD.A0U();
        this.A0N = AbstractC166987dD.A0U();
        setWillNotDraw(A0O);
        this.A07 = new C54788OJf(context);
    }
}
