package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.layout.BoxChildDataElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.IntrinsicHeightElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.lazy.ParentSizeElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import androidx.compose.ui.draw.PainterElement;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$2;
import androidx.compose.ui.focus.FocusPropertiesElement;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.layout.LayoutElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.layout.OnPlacedElement;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import androidx.compose.ui.platform.TestTagElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.instagram.barcelonaig.tixu.vpvd.VPVDElement;
import com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement;
import com.instagram.compose.core.ui.NoIndicationClickableElement;
import com.instagram.compose.core.ui.NoIndicationCombinedClickableKt$FocusableInNonTouchModeElement$1;
import com.instagram.compose.igds.core.IgdsAlphaIndicationElement;
import com.instagram.compose.perf.render.OnFirstContentDrawModifierElement;
import com.instagram.compose.ui.bouncy.BouncyClickableElement;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement;
import java.util.List;

/* renamed from: X.58N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C58N implements C58O {
    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX WARN: Type inference failed for: r13v0, types: [X.BZr, X.58J] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.58J, X.5bV] */
    /* JADX WARN: Type inference failed for: r13v11, types: [X.6Hg, X.58J] */
    /* JADX WARN: Type inference failed for: r13v13, types: [X.6Lf, X.58J] */
    /* JADX WARN: Type inference failed for: r13v14, types: [X.6Kp, X.58J] */
    /* JADX WARN: Type inference failed for: r13v16, types: [X.6Hf, X.58J] */
    /* JADX WARN: Type inference failed for: r13v17, types: [X.58J, X.6GW] */
    /* JADX WARN: Type inference failed for: r13v19, types: [X.58J, X.5gk] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.5bb, X.58J] */
    /* JADX WARN: Type inference failed for: r13v21, types: [X.5gA, java.lang.Object, X.58J] */
    /* JADX WARN: Type inference failed for: r13v25, types: [X.BGd, X.58J] */
    /* JADX WARN: Type inference failed for: r13v26, types: [X.58J, X.6GX] */
    /* JADX WARN: Type inference failed for: r13v27, types: [X.BZZ, X.58J] */
    /* JADX WARN: Type inference failed for: r13v28, types: [X.6Lb, X.58J] */
    /* JADX WARN: Type inference failed for: r13v29, types: [X.6Kv, X.58J] */
    /* JADX WARN: Type inference failed for: r13v30, types: [X.6Ke, X.58J] */
    /* JADX WARN: Type inference failed for: r13v32, types: [X.58J, X.5Dw] */
    /* JADX WARN: Type inference failed for: r13v33, types: [X.58J, X.5Du] */
    /* JADX WARN: Type inference failed for: r13v36, types: [X.58J, X.5Dv] */
    /* JADX WARN: Type inference failed for: r13v37, types: [X.5Zh, X.58J] */
    /* JADX WARN: Type inference failed for: r13v41, types: [androidx.compose.foundation.HoverableNode, X.58J] */
    /* JADX WARN: Type inference failed for: r13v43, types: [X.5Zc, X.58J] */
    /* JADX WARN: Type inference failed for: r13v44, types: [X.5Zj, X.5Dz, X.58J] */
    /* JADX WARN: Type inference failed for: r13v45, types: [X.58J, X.5a2] */
    /* JADX WARN: Type inference failed for: r13v46, types: [X.5Zt, X.58J] */
    /* JADX WARN: Type inference failed for: r13v47, types: [X.5Zs, X.58J] */
    /* JADX WARN: Type inference failed for: r13v48, types: [X.5Zu, X.58J] */
    /* JADX WARN: Type inference failed for: r13v49, types: [X.5Zv, X.58J] */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode, X.58J] */
    /* JADX WARN: Type inference failed for: r13v50, types: [X.5Zi, X.58J] */
    /* JADX WARN: Type inference failed for: r13v51, types: [X.58J, X.5ZK] */
    /* JADX WARN: Type inference failed for: r13v52, types: [X.58J, com.instagram.compose.ui.gradientspinner.GradientSpinnerNode] */
    /* JADX WARN: Type inference failed for: r13v6, types: [X.58J, X.6IZ] */
    /* JADX WARN: Type inference failed for: r13v8, types: [X.5aX, X.58J] */
    /* JADX WARN: Type inference failed for: r13v9, types: [X.58J, X.60a] */
    public C58J A00() {
        if (this instanceof GradientSpinnerModifierElement) {
            GradientSpinnerModifierElement gradientSpinnerModifierElement = (GradientSpinnerModifierElement) this;
            C25287BHf c25287BHf = gradientSpinnerModifierElement.A01;
            BHN bhn = gradientSpinnerModifierElement.A02;
            float f = gradientSpinnerModifierElement.A00;
            InterfaceC16610sE interfaceC16610sE = gradientSpinnerModifierElement.A03;
            C14360o3.A0B(c25287BHf, 1);
            C14360o3.A0B(bhn, 2);
            C14360o3.A0B(interfaceC16610sE, 4);
            ?? c58j = new C58J();
            c58j.A01 = c25287BHf;
            c58j.A02 = bhn;
            c58j.A00 = f;
            c58j.A04 = interfaceC16610sE;
            c58j.A03 = new C25289BHh(bhn);
            return c58j;
        }
        if (this instanceof PaddingElement) {
            PaddingElement paddingElement = (PaddingElement) this;
            float f2 = paddingElement.A02;
            float f3 = paddingElement.A03;
            float f4 = paddingElement.A01;
            float f5 = paddingElement.A00;
            boolean z = paddingElement.A04;
            ?? c58j2 = new C58J();
            c58j2.A02 = f2;
            c58j2.A03 = f3;
            c58j2.A01 = f4;
            c58j2.A00 = f5;
            c58j2.A04 = z;
            return c58j2;
        }
        if (this instanceof SizeElement) {
            SizeElement sizeElement = (SizeElement) this;
            float f6 = sizeElement.A03;
            float f7 = sizeElement.A02;
            float f8 = sizeElement.A01;
            float f9 = sizeElement.A00;
            boolean z2 = sizeElement.A04;
            ?? c58j3 = new C58J();
            c58j3.A03 = f6;
            c58j3.A02 = f7;
            c58j3.A01 = f8;
            c58j3.A00 = f9;
            c58j3.A04 = z2;
            return c58j3;
        }
        if (this instanceof AppendedSemanticsElement) {
            AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) this;
            boolean z3 = appendedSemanticsElement.A01;
            InterfaceC16660sJ interfaceC16660sJ = appendedSemanticsElement.A00;
            ?? c58j4 = new C58J();
            c58j4.A02 = z3;
            c58j4.A01 = false;
            c58j4.A00 = interfaceC16660sJ;
            return c58j4;
        }
        if (this instanceof PainterElement) {
            PainterElement painterElement = (PainterElement) this;
            C2DC c2dc = painterElement.A03;
            boolean z4 = painterElement.A05;
            Alignment alignment = painterElement.A01;
            C5YL c5yl = painterElement.A04;
            float f10 = painterElement.A00;
            C5YV c5yv = painterElement.A02;
            ?? c58j5 = new C58J();
            c58j5.A03 = c2dc;
            c58j5.A05 = z4;
            c58j5.A01 = alignment;
            c58j5.A04 = c5yl;
            c58j5.A00 = f10;
            c58j5.A02 = c5yv;
            return c58j5;
        }
        if (this instanceof OnPlacedElement) {
            InterfaceC16660sJ interfaceC16660sJ2 = ((OnPlacedElement) this).A00;
            ?? c58j6 = new C58J();
            c58j6.A00 = interfaceC16660sJ2;
            return c58j6;
        }
        if (this instanceof BlockGraphicsLayerElement) {
            InterfaceC16660sJ interfaceC16660sJ3 = ((BlockGraphicsLayerElement) this).A00;
            ?? c58j7 = new C58J();
            c58j7.A00 = interfaceC16660sJ3;
            return c58j7;
        }
        if (this instanceof OnFirstContentDrawModifierElement) {
            InterfaceC16820sZ interfaceC16820sZ = ((OnFirstContentDrawModifierElement) this).A00;
            C14360o3.A0B(interfaceC16820sZ, 1);
            ?? c58j8 = new C58J();
            c58j8.A00 = interfaceC16820sZ;
            return c58j8;
        }
        if (this instanceof CombinedClickableElement) {
            CombinedClickableElement combinedClickableElement = (CombinedClickableElement) this;
            InterfaceC16820sZ interfaceC16820sZ2 = combinedClickableElement.A05;
            String str = combinedClickableElement.A04;
            InterfaceC16820sZ interfaceC16820sZ3 = combinedClickableElement.A07;
            InterfaceC16820sZ interfaceC16820sZ4 = combinedClickableElement.A06;
            C5XO c5xo = combinedClickableElement.A01;
            InterfaceC118065Vq interfaceC118065Vq = combinedClickableElement.A00;
            boolean z5 = combinedClickableElement.A08;
            ?? abstractC114345Dz = new AbstractC114345Dz(interfaceC118065Vq, c5xo, combinedClickableElement.A02, combinedClickableElement.A03, interfaceC16820sZ2, z5);
            abstractC114345Dz.A00 = str;
            abstractC114345Dz.A02 = interfaceC16820sZ3;
            abstractC114345Dz.A01 = interfaceC16820sZ4;
            return abstractC114345Dz;
        }
        if (this instanceof FillElement) {
            FillElement fillElement = (FillElement) this;
            Integer num = fillElement.A01;
            float f11 = fillElement.A00;
            ?? c58j9 = new C58J();
            c58j9.A01 = num;
            c58j9.A00 = f11;
            return c58j9;
        }
        if (this instanceof NoIndicationCombinedClickableKt$FocusableInNonTouchModeElement$1) {
            return new C58J();
        }
        if (this instanceof HoverableElement) {
            C5XO c5xo2 = ((HoverableElement) this).A00;
            ?? c58j10 = new C58J();
            c58j10.A00 = c5xo2;
            return c58j10;
        }
        if (this instanceof FocusableElement) {
            return new C5Zn(((FocusableElement) this).A00);
        }
        if (this instanceof NoIndicationClickableElement) {
            NoIndicationClickableElement noIndicationClickableElement = (NoIndicationClickableElement) this;
            C5XO c5xo3 = noIndicationClickableElement.A00;
            boolean z6 = noIndicationClickableElement.A06;
            return new C118845a1(c5xo3, noIndicationClickableElement.A01, noIndicationClickableElement.A02, noIndicationClickableElement.A05, noIndicationClickableElement.A04, noIndicationClickableElement.A03, z6);
        }
        if (this instanceof IgdsAlphaIndicationElement) {
            IgdsAlphaIndicationElement igdsAlphaIndicationElement = (IgdsAlphaIndicationElement) this;
            return new C5E3(igdsAlphaIndicationElement.A01, igdsAlphaIndicationElement.A00, igdsAlphaIndicationElement.A02);
        }
        if (this instanceof WrapContentElement) {
            WrapContentElement wrapContentElement = (WrapContentElement) this;
            Integer num2 = wrapContentElement.A00;
            InterfaceC16620sF interfaceC16620sF = wrapContentElement.A01;
            ?? c58j11 = new C58J();
            c58j11.A00 = num2;
            c58j11.A01 = interfaceC16620sF;
            return c58j11;
        }
        if (this instanceof KeyInputElement) {
            KeyInputElement keyInputElement = (KeyInputElement) this;
            InterfaceC16660sJ interfaceC16660sJ4 = keyInputElement.A00;
            InterfaceC16660sJ interfaceC16660sJ5 = keyInputElement.A01;
            ?? c58j12 = new C58J();
            c58j12.A00 = interfaceC16660sJ4;
            c58j12.A01 = interfaceC16660sJ5;
            return c58j12;
        }
        if (this instanceof EmptySemanticsElement) {
            return ((EmptySemanticsElement) this).A00;
        }
        if (this instanceof DragAndDropModifierOnDragListener$modifier$1) {
            return ((DragAndDropModifierOnDragListener$modifier$1) this).A00.A02;
        }
        if (this instanceof RotaryInputElement) {
            InterfaceC16660sJ interfaceC16660sJ6 = ((RotaryInputElement) this).A00;
            ?? c58j13 = new C58J();
            c58j13.A00 = interfaceC16660sJ6;
            return c58j13;
        }
        if (this instanceof FocusPropertiesElement) {
            InterfaceC1130058j interfaceC1130058j = ((FocusPropertiesElement) this).A00;
            ?? c58j14 = new C58J();
            c58j14.A00 = interfaceC1130058j;
            return c58j14;
        }
        if (this instanceof FocusOwnerImpl$modifier$2) {
            return ((FocusOwnerImpl$modifier$2) this).A00.A01;
        }
        if (this instanceof TestTagElement) {
            String str2 = ((TestTagElement) this).A00;
            ?? c58j15 = new C58J();
            c58j15.A00 = str2;
            return c58j15;
        }
        if (this instanceof LayoutWeightElement) {
            LayoutWeightElement layoutWeightElement = (LayoutWeightElement) this;
            float f12 = layoutWeightElement.A00;
            boolean z7 = layoutWeightElement.A01;
            ?? c58j16 = new C58J();
            c58j16.A00 = f12;
            c58j16.A01 = z7;
            return c58j16;
        }
        if (this instanceof BackgroundElement) {
            BackgroundElement backgroundElement = (BackgroundElement) this;
            long j = backgroundElement.A01;
            C6L5 c6l5 = backgroundElement.A02;
            float f13 = backgroundElement.A00;
            C5AH c5ah = backgroundElement.A03;
            ?? c58j17 = new C58J();
            c58j17.A01 = j;
            c58j17.A03 = c6l5;
            c58j17.A00 = f13;
            c58j17.A06 = c5ah;
            c58j17.A02 = 9205357640488583168L;
            return c58j17;
        }
        if (this instanceof IntrinsicHeightElement) {
            IntrinsicHeightElement intrinsicHeightElement = (IntrinsicHeightElement) this;
            Integer num3 = intrinsicHeightElement.A00;
            boolean z8 = intrinsicHeightElement.A01;
            ?? c58j18 = new C58J();
            c58j18.A00 = num3;
            c58j18.A01 = z8;
            return c58j18;
        }
        if (this instanceof PaddingValuesElement) {
            InterfaceC1333460b interfaceC1333460b = ((PaddingValuesElement) this).A00;
            ?? c58j19 = new C58J();
            c58j19.A00 = interfaceC1333460b;
            return c58j19;
        }
        if (this instanceof DrawWithContentElement) {
            InterfaceC16660sJ interfaceC16660sJ7 = ((DrawWithContentElement) this).A00;
            ?? c58j20 = new C58J();
            c58j20.A00 = interfaceC16660sJ7;
            return c58j20;
        }
        if (this instanceof BorderModifierNodeElement) {
            BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) this;
            return new C137566Lc(borderModifierNodeElement.A01, borderModifierNodeElement.A02, borderModifierNodeElement.A00);
        }
        if (this instanceof SuspendPointerInputElement) {
            SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) this;
            return new C6KL(suspendPointerInputElement.A00, suspendPointerInputElement.A01, suspendPointerInputElement.A02);
        }
        if (this instanceof VisibilityChangeElement) {
            VisibilityChangeElement visibilityChangeElement = (VisibilityChangeElement) this;
            return new C60M(visibilityChangeElement.A00, visibilityChangeElement.A01, visibilityChangeElement.A02);
        }
        if (this instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) this;
            float f14 = graphicsLayerElement.A03;
            float f15 = graphicsLayerElement.A04;
            float f16 = graphicsLayerElement.A00;
            float f17 = graphicsLayerElement.A02;
            float f18 = graphicsLayerElement.A01;
            long j2 = graphicsLayerElement.A07;
            C5AH c5ah2 = graphicsLayerElement.A08;
            boolean z9 = graphicsLayerElement.A09;
            long j3 = graphicsLayerElement.A05;
            long j4 = graphicsLayerElement.A06;
            ?? c58j21 = new C58J();
            c58j21.A03 = f14;
            c58j21.A04 = f15;
            c58j21.A00 = f16;
            c58j21.A02 = f17;
            c58j21.A01 = f18;
            c58j21.A07 = j2;
            c58j21.A08 = c5ah2;
            c58j21.A0A = z9;
            c58j21.A05 = j3;
            c58j21.A06 = j4;
            c58j21.A09 = new C206929Dx(c58j21, 43);
            return c58j21;
        }
        if (this instanceof SizeAnimationModifierElement) {
            SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) this;
            return new C5E0(sizeAnimationModifierElement.A00, sizeAnimationModifierElement.A01);
        }
        if (this instanceof TextStringSimpleElement) {
            TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) this;
            String str3 = textStringSimpleElement.A05;
            C118125Vw c118125Vw = textStringSimpleElement.A03;
            C5DD c5dd = textStringSimpleElement.A04;
            int i = textStringSimpleElement.A02;
            boolean z10 = textStringSimpleElement.A06;
            int i2 = textStringSimpleElement.A00;
            int i3 = textStringSimpleElement.A01;
            ?? c58j22 = new C58J();
            c58j22.A06 = str3;
            c58j22.A04 = c118125Vw;
            c58j22.A05 = c5dd;
            c58j22.A02 = i;
            c58j22.A08 = z10;
            c58j22.A00 = i2;
            c58j22.A01 = i3;
            return c58j22;
        }
        if (this instanceof ClickableElement) {
            ClickableElement clickableElement = (ClickableElement) this;
            C5XO c5xo4 = clickableElement.A01;
            InterfaceC118065Vq interfaceC118065Vq2 = clickableElement.A00;
            boolean z11 = clickableElement.A05;
            return new AbstractC114345Dz(interfaceC118065Vq2, c5xo4, clickableElement.A02, clickableElement.A03, clickableElement.A04, z11);
        }
        if (this instanceof UnspecifiedConstraintsElement) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) this;
            float f19 = unspecifiedConstraintsElement.A01;
            float f20 = unspecifiedConstraintsElement.A00;
            ?? c58j23 = new C58J();
            c58j23.A01 = f19;
            c58j23.A00 = f20;
            return c58j23;
        }
        if (this instanceof ParentSizeElement) {
            ParentSizeElement parentSizeElement = (ParentSizeElement) this;
            float f21 = parentSizeElement.A00;
            InterfaceC74963Ym interfaceC74963Ym = parentSizeElement.A02;
            InterfaceC74963Ym interfaceC74963Ym2 = parentSizeElement.A01;
            ?? c58j24 = new C58J();
            c58j24.A00 = f21;
            c58j24.A02 = interfaceC74963Ym;
            c58j24.A01 = interfaceC74963Ym2;
            return c58j24;
        }
        if (this instanceof FocusTargetNode$FocusTargetElement) {
            return new C58J();
        }
        if (this instanceof OnGloballyPositionedElement) {
            InterfaceC16660sJ interfaceC16660sJ8 = ((OnGloballyPositionedElement) this).A00;
            ?? c58j25 = new C58J();
            c58j25.A00 = interfaceC16660sJ8;
            return c58j25;
        }
        if (this instanceof TextAnnotatedStringElement) {
            TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) this;
            C5C8 c5c8 = textAnnotatedStringElement.A03;
            C118125Vw c118125Vw2 = textAnnotatedStringElement.A04;
            C5DD c5dd2 = textAnnotatedStringElement.A05;
            InterfaceC16660sJ interfaceC16660sJ9 = textAnnotatedStringElement.A09;
            int i4 = textAnnotatedStringElement.A02;
            boolean z12 = textAnnotatedStringElement.A0A;
            int i5 = textAnnotatedStringElement.A00;
            int i6 = textAnnotatedStringElement.A01;
            List list = textAnnotatedStringElement.A06;
            InterfaceC16660sJ interfaceC16660sJ10 = textAnnotatedStringElement.A07;
            InterfaceC16660sJ interfaceC16660sJ11 = textAnnotatedStringElement.A08;
            ?? c58j26 = new C58J();
            c58j26.A04 = c5c8;
            c58j26.A05 = c118125Vw2;
            c58j26.A06 = c5dd2;
            c58j26.A0A = interfaceC16660sJ9;
            c58j26.A02 = i4;
            c58j26.A0C = z12;
            c58j26.A00 = i5;
            c58j26.A01 = i6;
            c58j26.A07 = list;
            c58j26.A08 = interfaceC16660sJ10;
            c58j26.A09 = interfaceC16660sJ11;
            return c58j26;
        }
        if (this instanceof BouncyClickableElement) {
            BouncyClickableElement bouncyClickableElement = (BouncyClickableElement) this;
            boolean z13 = bouncyClickableElement.A09;
            float f22 = bouncyClickableElement.A02;
            float f23 = bouncyClickableElement.A01;
            float f24 = bouncyClickableElement.A03;
            float f25 = bouncyClickableElement.A00;
            return new C136786Hh(bouncyClickableElement.A04, bouncyClickableElement.A05, bouncyClickableElement.A06, bouncyClickableElement.A08, bouncyClickableElement.A07, f22, f23, f24, f25, z13);
        }
        if (this instanceof VerticalAlignElement) {
            InterfaceC118225Wj interfaceC118225Wj = ((VerticalAlignElement) this).A00;
            ?? c58j27 = new C58J();
            c58j27.A00 = interfaceC118225Wj;
            return c58j27;
        }
        if (this instanceof VPVDElement) {
            VPVDElement vPVDElement = (VPVDElement) this;
            return new C60N(vPVDElement.A00, vPVDElement.A01);
        }
        if (this instanceof OffsetElement) {
            OffsetElement offsetElement = (OffsetElement) this;
            float f26 = offsetElement.A00;
            float f27 = offsetElement.A01;
            boolean z14 = offsetElement.A02;
            ?? c58j28 = new C58J();
            c58j28.A00 = f26;
            c58j28.A01 = f27;
            c58j28.A02 = z14;
            return c58j28;
        }
        if (this instanceof BoxChildDataElement) {
            BoxChildDataElement boxChildDataElement = (BoxChildDataElement) this;
            Alignment alignment2 = boxChildDataElement.A00;
            boolean z15 = boxChildDataElement.A01;
            ?? c58j29 = new C58J();
            c58j29.A00 = alignment2;
            c58j29.A01 = z15;
            return c58j29;
        }
        if (this instanceof NestedScrollElement) {
            NestedScrollElement nestedScrollElement = (NestedScrollElement) this;
            return new NestedScrollNode(nestedScrollElement.A00, nestedScrollElement.A01);
        }
        if (this instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) {
            C6IO c6io = ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) this).A00;
            ?? c58j30 = new C58J();
            c58j30.A00 = c6io;
            return c58j30;
        }
        if (this instanceof TraversablePrefetchStateModifierElement) {
            C6MH c6mh = ((TraversablePrefetchStateModifierElement) this).A00;
            ?? c58j31 = new C58J();
            c58j31.A00 = c6mh;
            return c58j31;
        }
        if (this instanceof LazyLayoutSemanticsModifier) {
            LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) this;
            InterfaceC16820sZ interfaceC16820sZ5 = lazyLayoutSemanticsModifier.A02;
            return new C6NS(lazyLayoutSemanticsModifier.A00, lazyLayoutSemanticsModifier.A01, interfaceC16820sZ5, lazyLayoutSemanticsModifier.A04, lazyLayoutSemanticsModifier.A03);
        }
        if (this instanceof ScrollableElement) {
            ScrollableElement scrollableElement = (ScrollableElement) this;
            C6M4 c6m4 = scrollableElement.A04;
            InterfaceC137936Mt interfaceC137936Mt = scrollableElement.A00;
            C6MZ c6mz = scrollableElement.A02;
            C6M3 c6m3 = scrollableElement.A03;
            boolean z16 = scrollableElement.A06;
            boolean z17 = scrollableElement.A07;
            return new C6NT(interfaceC137936Mt, scrollableElement.A01, c6mz, c6m3, c6m4, scrollableElement.A05, z16, z17);
        }
        if (this instanceof DrawBehindElement) {
            InterfaceC16660sJ interfaceC16660sJ12 = ((DrawBehindElement) this).A00;
            ?? c58j32 = new C58J();
            c58j32.A00 = interfaceC16660sJ12;
            return c58j32;
        }
        if (this instanceof HorizontalAlignElement) {
            InterfaceC118245Wl interfaceC118245Wl = ((HorizontalAlignElement) this).A00;
            ?? c58j33 = new C58J();
            c58j33.A00 = interfaceC118245Wl;
            return c58j33;
        }
        InterfaceC16610sE interfaceC16610sE2 = ((LayoutElement) this).A00;
        ?? c58j34 = new C58J();
        c58j34.A00 = interfaceC16610sE2;
        return c58j34;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c5, code lost:
    
        if (r0 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ce, code lost:
    
        if (r11 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r2.equals(r1) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04d3, code lost:
    
        if (r4 != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        if (r10 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        X.AbstractC114335Dx.A02(r14).A0L();
        X.C5Zx.A00(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
    
        if (r13 == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
    
        if (r12 == false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0501  */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48, types: [X.58J, X.5gk, X.58K] */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01(X.C58J r25) {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58N.A01(X.58J):void");
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }
}
